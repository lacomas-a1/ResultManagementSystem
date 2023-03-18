/**
 * 
 */
package com.system.Management.Service;

import java.util.List;

import com.system.Management.Model.Class;

/**
 * @author Lacomas
 *
 */
public interface ClassService {
	List<Class> getAllClasses();
    void saveClass(Class class1);
    Class getClassById(long id);
    void deleteClassById(long id);

}
