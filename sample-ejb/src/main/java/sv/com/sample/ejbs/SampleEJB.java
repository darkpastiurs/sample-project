package sv.com.sample.ejbs;

import java.util.List;

import sv.com.sample.entities.Sample;

public interface SampleEJB {

    List<Sample> findAll();

}
