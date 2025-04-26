package model;

public interface IJoueur {
    String getNom();
    char getPion();
    int[] jouerTour(model.IPlateau plateau);
}
