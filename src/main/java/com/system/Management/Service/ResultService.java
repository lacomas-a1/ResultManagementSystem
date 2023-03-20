package com.system.Management.Service;

import java.util.List;
import com.system.Management.Model.Result;

public interface ResultService {
	List<Result> getAllResults();
    void saveResult(Result result);
    Result getResultById(long id);
    void deleteResultById(long id);

}
