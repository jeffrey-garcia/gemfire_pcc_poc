package com.example.demogemfireclient;

import org.springframework.data.gemfire.mapping.Region;
import org.springframework.data.gemfire.repository.GemfireRepository;

/**
 * Created by derrickwong on 29/5/2017.
 */
@Region("ClientHealth")
public interface ClientHealthInfoRepository extends GemfireRepository<ClientHealthInfo, String> {
}
