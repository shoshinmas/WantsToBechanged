package com.infor.quiz;
import java.util.*;

public class WantsToBeChanged {
    /*
    This method will do something and doesn't return a value.
     */

    public void performOperation(OperationDefinition op, Map<Long, String> theMainMap, OperSummary sum) {
        for (int d = 0; d < op.getOperationDetailsStore().size(); ) // continue until the end of the OperationDefinition size
        {
            OperationDetail opDetails = (OperationDetail) op.getOperationDetailsStore().get(d);
            if (opDetails.getRelblkId() != null && opDetails.getOperationsumRefId() != null &&
                    opDetails.getOperationsumParentId() != null)
            {
                sum.setOpCond(true); // set conditions as true
                sum.setIsReliefOperation("Y"); // set the state to Y
                theMainMap.put(opDetails.getOperationsumId(), "Y"); // put the Map theMainMap state as given
            }
            else
            {
                sum.setOpCond(true);
            }
        }
    }
}
