package com.rwinkeler.matchingengine.application.dto;

public record OrderRequest(String id, String instrument, String side, double price, long quantity) {
}
