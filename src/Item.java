public class Item
{
    private final int id;
    private final String name;

    public Item(int id, String name) {
        World.getInstance().getItemPool().add(this);
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void information()
    {
        System.out.print(name + " ");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Item)) {
            return false;
        }

        return this.id == ((Item) obj).id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
