package net.minecraft.src;

import d4rk.animals.AnimalCount;

public class ItemSpade extends ItemTool
{
    /** an array of the blocks this spade is effective against */
    private static Block[] blocksEffectiveAgainst = new Block[] {Block.grass, Block.dirt, Block.sand, Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand, Block.mycelium};

    public ItemSpade(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, 1, par2EnumToolMaterial, blocksEffectiveAgainst);
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
    }
    
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if(shiftedIndex == Item.shovelStone.shiftedIndex)
    		AnimalCount.ac.init(par3EntityPlayer).checkChunk();
    	if(shiftedIndex == Item.shovelSteel.shiftedIndex)
    		AnimalCount.ac.init(par3EntityPlayer).checkWorld();
        return par1ItemStack;
    }
}
