package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * Created by ameya on 4/22/2017.
 */
//@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest extends AndroidTestCase {


    public void testFetchJoke() {
        new EndpointsAsyncTask(new EndpointsAsyncTask.AsyncResponse() {
            @Override
            public void returnResponse(String output) {
                assertNotNull(output);
                assertNotSame(output, "");
            }
        }
        );
    }
}
