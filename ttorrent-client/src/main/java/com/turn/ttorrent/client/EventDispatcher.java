package com.turn.ttorrent.client;

import java.util.List;

public class EventDispatcher {

  private final List<TorrentListener> listeners;

  public EventDispatcher(List<TorrentListener> listeners) {
    this.listeners = listeners;
  }

  void notifyPeerConnected(PeerInformation peerInformation) {
    for (TorrentListener listener : listeners) {
      listener.peerConnected(peerInformation);
    }
  }

  void notifyPeerDisconnected(PeerInformation peerInformation) {
    for (TorrentListener listener : listeners) {
      listener.peerDisconnected(peerInformation);
    }
  }
}
