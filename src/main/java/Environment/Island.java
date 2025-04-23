package Environment;

public class Island {
    private final Location[][] locations;

    public Island(int width, int height) {
        locations = new Location[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                locations[i][j] = new Location();
            }
        }
    }

    public Location getLocation(int x, int y) {
        return locations[y][x];
    }

    public int getWidth() {
        return locations[0].length;
    }

    public int getHeight() {
        return locations.length;
    }
}
