package json.models;
public enum AlbumType
{
    ALBUM, SINGLE, COMPILATION, UNKNOWN;

    public static AlbumType fromOrdinal(int ordinal)
    {
        return AlbumType.values()[ordinal];
    }

}