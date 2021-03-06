package deadbycube.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemStackBuilder {

    private Material material;
    private int amount = 1;
    private byte data = 0;
    private short damage = 0;

    private String localizedName = null;
    private boolean unbreakable = false;

    private ItemFlag[] flags = {};

    public ItemStackBuilder(Material material) {
        this.material = material;
    }

    public ItemStackBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public ItemStackBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public ItemStackBuilder setData(byte data) {
        this.data = data;
        return this;
    }

    public ItemStackBuilder setDamage(short damage) {
        this.damage = damage;
        return this;
    }

    public ItemStackBuilder setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    public ItemStackBuilder setUnbreakable(boolean unbreakable) {
        this.unbreakable = unbreakable;
        return this;
    }

    public ItemStackBuilder setFlags(ItemFlag... flags) {
        this.flags = flags;
        return this;
    }

    public ItemStack build() {
        ItemStack itemStack = new ItemStack(material, amount, damage, data);

        ItemMeta itemMeta = itemStack.getItemMeta();
        if (localizedName != null)
            itemMeta.setLocalizedName(localizedName);
        itemMeta.setUnbreakable(unbreakable);
        itemMeta.addItemFlags(flags);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

}
