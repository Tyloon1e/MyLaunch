package me.Tyloon1e.MyLaunch;

import org.bukkit.plugin.java.JavaPlugin;

public class MyLaunch extends JavaPlugin {

	@Override
	public void onEnable() {
		this.getCommand("mylaunch").setExecutor(new Fly());
	}

}
