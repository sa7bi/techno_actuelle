/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoryUser;

import Model.User;
import java.util.Hashtable;

/**
 *
 * @author francill
 */
public class Utilisateurs {
    public static Hashtable<Integer,User>  users =null;
    //public static Integer incId = 1010;

    public static boolean verifyUser(String user, String password){
        if(users == null){
            users = new Hashtable<Integer,User>();
            users.put(1001, new User("termine", "ptermine", 8, 1));
            users.put(1002, new User("daucourt","pdaucourt", 3, 4));
            users.put(1003, new User("francillon","pfrancillon", 0, 2));
            users.put(1004, new User("dupont","pdupont", 14, 3));
            users.put(1005, new User("t","t", 25, 5));
            users.put(1006, new User("ranjit","ranjit", 85, 6));
            users.put(1007, new User("santi","santi", 90, 5));
            users.put(1008, new User("noemie","noemie", 125, 2));
            users.put(1009, new User("sahbi","sahbi", 98, 1));
        }     
        
        boolean res = false;
        
        for (Integer index : users.keySet()) {
            if (users.get(index).getUsername().equals(user)&& users.get(index).getPassword().equals(password)) {
                res = true;
            }
        }
        /*if(users.get(id)!=null){
            if ( users.get(user.getPassword()).equals(user.getPassword()) ) return true;else return false;
        }else return false;*/
        return res;
    }
    
    public static boolean addUser(String username, String password, Integer points,Integer avatar){
        User tmp_user = new User(username,password,points,avatar);
        boolean res = false;
        Integer size = users.size();
        if (users.put(size++,tmp_user) != null) {
            res = true;
        }
        return res;
    }
    
    public static boolean updateUser(String oldUsername, String username, String password){
        boolean res = false;
        
        if(users.get(oldUsername)!=null){
            users.get(oldUsername);
        }
        
        return res;
    }
    
    public static User getUser(String username, String password){
        User user=null;
        for (Integer index : users.keySet()) {
            if (users.get(index).getUsername().equals(user) && users.get(index).getPassword().equals(password)) {
                user = users.get(index);
            }
        }
        return user;
    }
}
