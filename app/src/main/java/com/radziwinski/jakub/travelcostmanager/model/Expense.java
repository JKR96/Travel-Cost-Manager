package com.radziwinski.jakub.travelcostmanager.model;

import java.util.Map;

public class Expense {
    private String mName;
    private String mValue;
    private Map<Person, Double> mPaidBy;
    private Map<Person, Double> mBurdenOn;
}
