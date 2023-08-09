package com.redlimerl.speedrunigt.events;

import com.minecraftspeedrunning.srigt.common.events.Event;

import java.util.Collection;
import java.util.List;

public interface EventRepository {
    List<Event> getEvents();
    void addEvent(Event event);
    void addEvents(Collection<Event> events);
}
