package com.intuit.wasabi.repository.cassandra.accessor;

import com.datastax.driver.mapping.Result;
import com.datastax.driver.mapping.annotations.Accessor;
import com.datastax.driver.mapping.annotations.Query;

@Accessor
public interface ApplicationListAccessor {

    //TODO: Jamir says this won't work. ask him for details.
    @Query("select distinct app_name from applicationList")
    Result<String> getUniqueAppName();
}
