package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class ScenarioContext {

    private ThreadLocal<ScenarioContextData> threadLocal;
    public ScenarioContext(){

        threadLocal = new ThreadLocal<>();
        threadLocal.set(new ScenarioContextData());
    }

    public ScenarioContextData getScenarioContextData(){

        return threadLocal.get();
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ScenarioContextData{

        private Booking booking;
    }
}
