package com.radziwinski.jakub.travelcostmanager.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Trip {
    private UUID mId;
    private String mName;
    private Date mStart;
    private Date mEnd;
    private List<Person> mPeople;
    private List<Expense> mExpenseList;

    public Trip() {
        mId = UUID.randomUUID();
        mName = "Trip no." + mId.toString().substring(0,6);
        mStart = new Date();
        mEnd = new Date();
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public Date getStart() {
        return mStart;
    }

    public void setStart(Date start) {
        mStart = start;
    }

    public Date getEnd() {
        return mEnd;
    }

    public void setEnd(Date end) {
        mEnd = end;
    }

    public List<Person> getPeople() {
        return mPeople;
    }

    public void setPeople(List<Person> people) {
        mPeople = people;
    }

    public List<Expense> getExpenseList() {
        return mExpenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        mExpenseList = expenseList;
    }


}
