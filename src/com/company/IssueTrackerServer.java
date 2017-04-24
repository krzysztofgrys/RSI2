package com.company;

import java.util.HashMap;

/**
 * Created by krzysztofgrys on 4/24/17.
 */
public class IssueTrackerServer {

    private int id;
    private HashMap<String, HashMap<Integer, Issue>> issues;

    public IssueTrackerServer() {
        issues = new HashMap<>();
        id = 0;

        if(System.getSecurityManager() == null){
            System.setSecurityManager(new java.rmi.RMISecurityManager());
        }

        try{


        }catch (Exception e){
            System.out.println("Error, server can'y start");
            e.printStackTrace();
            return;
        }

    }


    int putIssue(Issue issue, String projectName) {
        HashMap<Integer, Issue> is = new HashMap<>();
        is.put(id, issue);
        issues.put(projectName, is);
        return id;
    }

    Issue get(String project, int id) {
        if (issues.containsKey(project) && issues.get(project).containsKey(id)) {
            return issues.get(project).get(id);
        }
        return null;
    }

    boolean delete(String project, int id) {
        if (issues.containsKey(project) && issues.get(project).containsKey(id)) {
           issues.get(project).remove(id);
           return  true;
        }

        return false;
    }


}
