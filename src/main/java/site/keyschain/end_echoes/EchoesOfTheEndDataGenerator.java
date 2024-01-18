package site.keyschain.end_echoes;

import site.keyschain.end_echoes.datagen.ModBlockTagProvider;
import site.keyschain.end_echoes.datagen.ModRecipeProvider;
import site.keyschain.end_echoes.datagen.ModLootTableProvider;
import site.keyschain.end_echoes.datagen.ModModelProvider;
import site.keyschain.end_echoes.datagen.ModItemTagProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class EchoesOfTheEndDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		//pack.addProvider(ModItemTagProvider::new);
	}
}
