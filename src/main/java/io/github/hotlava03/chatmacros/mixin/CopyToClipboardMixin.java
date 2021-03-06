package io.github.hotlava03.chatmacros.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.text.LiteralText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;


@Mixin(ClientPlayerEntity.class)
public class CopyToClipboardMixin {
    @Inject(method = "sendChatMessage(Ljava/lang/String;)V", at = @At("HEAD"), cancellable = true)

    public void onSendChatMessageSDM(String message, CallbackInfo info) {
        if (message.startsWith("/chatmacros")) info.cancel();
        else return;

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();

        Toolkit.getDefaultToolkit().getSystemClipboard()
                .setContents(new StringSelection(
                                message.replaceFirst("/chatmacros ", "")
                                        .replace("§", "&")
                                        .replace("Games >> Copy ", "")
                                        .replace(" to get rewards!", "")
                                        .replace("Games >> Solve ", "")),
                        null);

        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        Runnable task = new Runnable() {
            public void run() {
                MinecraftClient.getInstance().inGameHud.getChatHud().addMessage(new LiteralText("\u00a79Chat Games \u00a78\u00BB \u00a77will start after a few seconds."));
            }
        };

        int delay = 295;
        scheduler.schedule(task, delay, TimeUnit.SECONDS);
        scheduler.shutdown();

        String result = null;
        try {
            result = (String) clipboard.getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException | IOException e) {
            e.printStackTrace();
        }

        if (result.contains("What are Creepers scared of?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("ocelot"),
                            null);
        else if(result.contains("What can you wear to stop Enderman attacking you?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("pumpkin"),
                            null);
        else if(result.contains("What item do you need to breed llamas?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("hay bales"),
                            null);
        else if(result.contains("How many neutral mobs exist? (1.15)"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("11"),
                            null);
        else if(result.contains("How many hit points does a Ghast have?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("10"),
                            null);
        else if(result.contains("How many mobs are tameable? (1.15)?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("9"),
                            null);
        else if(result.contains("How many items can you craft with iron ingots? (1.15)"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("33"),
                            null);
        else if(result.contains("How many music discs are there? (1.15)"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("12"),
                            null);
        else if(result.contains("On average, how many uses does an anvil survive?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("25"),
                            null);
        else if(result.contains("Does chain armor yield iron nuggets when smelted? (1.15)"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("yes"),
                            null);
        else if(result.contains("Are beehives obtainable with silk touch? (1.15)"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("yes"),
                            null);
        else if(result.contains("Does a looting enchanted bow yield more drops?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("no"),
                            null);
        else if(result.contains("Name an enchant that conflicts with smite."))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("sharpness"),
                            null);
        else if(result.contains("What is the minimum amount of bookshelfs needed to get level 18 enchants?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("7"),
                            null);
        else if(result.contains("What is the official name of update 1.4?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("pretty scary update"),
                            null);
        else if(result.contains("What is the official name of update 1.5?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("redstone update"),
                            null);
        else if(result.contains("What is the official name of update 1.6?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("horse update"),
                            null);
        else if(result.contains("What is the official name of update 1.7?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("the update that changed the world"),
                            null);
        else if(result.contains("What is the official name of update 1.8?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("bountiful update"),
                            null);
        else if(result.contains("What is the official name of update 1.9?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("combat update"),
                            null);
        else if(result.contains("What is the official name of update 1.10?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("frostburn update"),
                            null);
        else if(result.contains("What is the official name of update 1.11?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("exploration update"),
                            null);
        else if(result.contains("What is the official name of update 1.12?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("world of color update"),
                            null);
        else if(result.contains("What is the official name of update 1.13?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("aquatic update"),
                            null);
        else if(result.contains("What is the official name of update 1.14?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("village and pillage"),
                            null);
        else if(result.contains("What is the official name of update 1.15?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("buzzy bees"),
                            null);
        else if(result.contains("What minecraft version added desert pyramids?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.3"),
                            null);
        else if(result.contains("What minecraft version added command blocks?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.4"),
                            null);
        else if(result.contains("What minecraft version added scoreboards?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.5"),
                            null);
        else if(result.contains("What minecraft version changed texture packs to resource packs?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.6"),
                            null);
        else if(result.contains("What minecraft version introduced amplified terrain?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.7"),
                            null);
        else if(result.contains("What minecraft version added the @e (entity) selector?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.8"),
                            null);
        else if(result.contains("What minecraft version overhauled the End?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.9"),
                            null);
        else if(result.contains("What minecraft version introduced auto jump?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.10"),
                            null);
        else if(result.contains("What minecraft version increased the chat message length to 256 characters?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.11"),
                            null);
        else if(result.contains("What minecraft version added hotbar saving/loading in creative mode?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.12"),
                            null);
        else if(result.contains("What minecraft version added datapacks?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.13"),
                            null);
        else if(result.contains("What minecraft versino added suspicious stew?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.14"),
                            null);
        else if(result.contains("What minecraft version introduced bees?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1.15"),
                            null);
        else if(result.contains("What item do you use in a brewing stand to create a thick potion?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("glowstone dust"),
                            null);
        else if(result.contains("How many seconds does it take for the regeneration I effect to heal 3 hearts?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("15"),
                            null);
        else if(result.contains("What item do you need to create a strength I potion from an awkward potion?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("blaze powder"),
                            null);
        else if(result.contains("How many seconds does a regular leaping II potion last for?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("90"),
                            null);
        else if(result.contains("How many unused and removed biomes are there in total? (1.15)"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("7"),
                            null);
        else if(result.contains("Name an overworld biome not required for the adventure time (discover every biomes) advancement. (1.15)"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("deep ocean"),
                            null);
        else if(result.contains("What is the maximum temperature value a biome can have to allow snowfall?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("0.15"),
                            null);
        else if(result.contains("What tool do you need to mine a beacon?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("none"),
                            null);
        else if(result.contains("How many minecraft editions/games are there?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("7"),
                            null);
        else if(result.contains("What minecraft edition/game are you currently playing?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("java"),
                            null);
        else if(result.contains("What is Notch''s real name?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("markus persson"),
                            null);
        else if(result.contains("What year was minecraft classic released?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("2009"),
                            null);
        else if(result.contains("What year was minecraft''s full release?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("2011"),
                            null);
        else if(result.contains("How many minecraft editions have uncensored chat?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("1"),
                            null);
        else if(result.contains("What super mario 64 item was the elytra inspired by?"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("wing cap"),
                            null);
        else if(result.contains("Give the 1st letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("a"),
                            null);
        else if(result.contains("Give the 2nd letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("b"),
                            null);
        else if(result.contains("Give the 3rd letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("c"),
                            null);
        else if(result.contains("Give the 4th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("d"),
                            null);
        else if(result.contains("Give the 5th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("e"),
                            null);
        else if(result.contains("Give the 6th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("f"),
                            null);
        else if(result.contains("Give the 7th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("g"),
                            null);
        else if(result.contains("Give the 8th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("h"),
                            null);
        else if(result.contains("Give the 9th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("i"),
                            null);
        else if(result.contains("Give the 10th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("j"),
                            null);
        else if(result.contains("Give the 11th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("k"),
                            null);
        else if(result.contains("Give the 12th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("l"),
                            null);
        else if(result.contains("Give the 13th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("m"),
                            null);
        else if(result.contains("Give the 14th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("n"),
                            null);
        else if(result.contains("Give the 15th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("o"),
                            null);
        else if(result.contains("Give the 16th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("p"),
                            null);
        else if(result.contains("Give the 17th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("q"),
                            null);
        else if(result.contains("Give the 18th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("r"),
                            null);
        else if(result.contains("Give the 19th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("s"),
                            null);
        else if(result.contains("Give the 20th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("t"),
                            null);
        else if(result.contains("Give the 21st letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("u"),
                            null);
        else if(result.contains("Give the 22nd letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("v"),
                            null);
        else if(result.contains("Give the 23rd letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("w"),
                            null);
        else if(result.contains("Give the 24th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("x"),
                            null);
        else if(result.contains("Give the 25th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("y"),
                            null);
        else if(result.contains("Give the 26th letter in the alphabet"))
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection("z"),
                            null);
        else if(result.contains("Decode")) {
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection(
                                    message.replace("/chatmacros Games >> Decode ","")
                                            .replace(" to get rewards!","")),
                            null);
            String[] jumble = {"acacia boat","acacia button","acacia door","acacia fence","acacia fence gate","acacia leaves","acacia log","acacia planks","acacia pressure plate","acacia sapling","acacia sign","acacia slab","acacia stairs","acacia trapdoor","acacia wood","activator rail","allium","andesite","andesite slab","andesite stairs","andesite wall","anvil","apple","armor stand","arrow","azure bluet","baked potato","bamboo","bamboo sapling","barrel","barrier","bat spawn egg","beacon","bedrock","bee nest","bee spawn egg","beef","beehive","beetroot","beetroot seeds","beetroot soup","beetroots","bell","birch boat","birch button","birch door","birch fence","birch fence gate","birch leaves","birch log","birch planks","birch pressure plate","birch sapling","birch sign","birch slab","birch stairs","birch trapdoor","birch wood","black banner","black bed","black carpet","black concrete","black concrete powder","black dye","black glazed terracotta","black shulker box","black stained glass","black stained glass pane","black terracotta","black wool","blast furnace","blaze powder","blaze rod","blaze spawn egg","blue banner","blue bed","blue carpet","blue concrete","blue concrete powder","blue dye","blue glazed terracotta","blue ice","blue orchid","blue shulker box","blue stained glass","blue stained glass pane","blue terracotta","blue wool","bone","bone block","bone meal","book","bookshelf","bow","bowl","brain coral","brain coral block","brain coral fan","bread","brewing stand","brick","brick slab","brick stairs","brick wall","bricks","brown banner","brown bed","brown carpet","brown concrete","brown concrete powder","brown dye","brown glazed terracotta","brown mushroom","brown mushroom block","brown shulker box","brown stained glass","brown stained glass pane","brown terracotta","brown wool","bubble column","bubble coral","bubble coral block","bubble coral fan","bucket","cactus","cake","campfire","carrot","carrot on a stick","carrots","cartography table","carved pumpkin","cat spawn egg","cauldron","cave air","cave spider spawn egg","chain command block","chainmail boots","chainmail chestplate","chainmail helmet","chainmail leggings","charcoal","chest","chest minecart","chicken","chicken spawn egg","chipped anvil","chiseled quartz block","chiseled red sandstone","chiseled sandstone","chiseled stone bricks","chorus flower","chorus fruit","chorus plant","clay","clay ball","clock","coal","coal block","coal ore","coarse dirt","cobblestone","cobblestone slab","cobblestone stairs","cobblestone wall","cobweb","cocoa","cocoa beans","cod","cod bucket","cod spawn egg","command block","command block minecart","comparator","compass","composter","conduit","cooked beef","cooked chicken","cooked cod","cooked mutton","cooked porkchop","cooked rabbit","cooked salmon","cookie","cornflower","cow spawn egg","cracked stone bricks","crafting table","creeper head","creeper spawn egg","crossbow","cut red sandstone","cut red sandstone slab","cut sandstone","cut sandstone slab","cyan banner","cyan bed","cyan carpet","cyan concrete","cyan concrete powder","cyan dye","cyan glazed terracotta","cyan shulker box","cyan stained glass","cyan stained glass pane","cyan terracotta","cyan wool","Damaged anvil","dandelion","dark oak boat","dark oak button","dark oak door","dark oak fence","dark oak fence gate","dark oak leaves","dark oak log","dark oak planks","dark oak pressure plate","dark oak sapling","dark oak sign","dark oak slab","dark oak stairs","dark oak trapdoor","dark oak wood","dark prismarine","dark prismarine slab","dark prismarine stairs","daylight detector","dead brain coral","dead brain coral block","dead brain coral fan","dead bubble coral","dead bubble coral block","dead bubble coral fan","dead bush","dead fire coral","dead fire coral block","dead fire coral fan","dead horn coral","dead horn coral block","dead horn coral fan","dead tube coral","dead tube coral block","dead tube coral fan","detector rail","diamond","diamond axe","diamond block","diamond boots","diamond chestplate","diamond helmet","diamond hoe","diamond horse armor","diamond leggings","diamond ore","diamond pickaxe","diamond shovel","diamond sword","diorite","diorite slab","diorite stairs","diorite wall","dirt","dispenser","dolphin spawn egg","donkey spawn egg","dragon breath","dragon egg","dragon head","dried kelp","dried kelp block","dropper","drowned spawn egg","egg","elder guardian spawn egg","elytra","emerald","emerald block","emerald ore","enchanted book","enchanted golden apple","enchanting table","end crystal","end gateway","end portal","end portal frame","end rod","end stone","end stone brick slab","end stone brick stairs","end stone brick wall","end stone bricks","ender chest","ender eye","ender pearl","enderman spawn egg","endermite spawn egg","evoker spawn egg","experience bottle","farmland","feather","fermented spider eye","fern","filled map","fire","fire charge","fire coral","fire coral block","fire coral fan","firework rocket","firework star","fishing rod","fletching table","flint","flint and steel","flower pot","fox spawn egg","frosted ice","furnace","furnace minecart","ghast spawn egg","ghast tear","glass","glass bottle","glass pane","glistering melon slice","glowstone","glowstone dust","gold block","gold ingot","gold nugget","gold ore","golden apple","golden axe","golden boots","golden carrot","golden chestplate","golden helmet","golden hoe","golden horse armor","golden leggings","golden pickaxe","golden shovel","golden sword","granite","granite slab","granite stairs","granite wall","grass","grass block","grass path","gravel","gray banner","gray bed","gray carpet","gray concrete","gray concrete powder","gray dye","gray glazed terracotta","gray shulker box","gray stained glass","gray stained glass pane","gray terracotta","gray wool","green banner","green bed","green carpet","green concrete","green concrete powder","green dye","green glazed terracotta","green shulker box","green stained glass","green stained glass pane","green terracotta","green wool","grindstone","guardian spawn egg","gunpowder","hay block","heart of the sea","heavy weighted pressure plate","honey block","honey bottle","honeycomb","honeycomb block","hopper","hopper minecart","horn coral","horn coral block","horn coral fan","horse spawn egg","husk spawn egg","ice","infested chiseled stone bricks","infested cobblestone","infested cracked stone bricks","infested mossy stone bricks","infested stone","infested stone bricks","ink sac","iron axe","iron bars","iron block","iron boots","iron chestplate","iron door","iron helmet","iron hoe","iron horse armor","iron ingot","iron leggings","iron nugget","iron ore","iron pickaxe","iron shovel","iron sword","iron trapdoor","item frame","jack o lantern","jigsaw","jukebox","jungle boat","jungle button","jungle door","jungle fence","jungle fence gate","jungle leaves","jungle log","jungle planks","jungle pressure plate","jungle sapling","jungle sign","jungle slab","jungle stairs","jungle trapdoor","jungle wood","kelp","kelp plant","knowledge book","ladder","lantern","lapis block","lapis lazuli","lapis ore","large fern","lava","lava bucket","lead","leather","leather boots","leather chestplate","leather helmet","leather horse armor","leather leggings","lectern","lever","light blue banner","light blue bed","light blue carpet","light blue concrete","light blue concrete powder","light blue dye","light blue glazed terracotta","light blue shulker box","light blue stained glass","light blue stained glass pane","light blue terracotta","light blue wool","light gray banner","light gray bed","light gray carpet","light gray concrete","light gray concrete powder","light gray dye","light gray glazed terracotta","light gray shulker box","light gray stained glass","light gray stained glass pane","light gray terracotta","light gray wool","light weighted pressure plate","lilac","lily of the valley","lily pad","lime banner","lime bed","lime carpet","lime concrete","lime concrete powder","lime dye","lime glazed terracotta","lime shulker box","lime stained glass","lime stained glass pane","lime terracotta","lime wool","lingering potion","llama spawn egg","loom","magenta banner","magenta bed","magenta carpet","magenta concrete","magenta concrete powder","magenta dye","magenta glazed terracotta","magenta shulker box","magenta stained glass","magenta stained glass pane","magenta terracotta","magenta wool","magma block","magma cream","magma cube spawn egg","map","melon","melon seeds","melon slice","melon stem","milk bucket","minecart","mooshroom spawn egg","mossy cobblestone","mossy cobblestone slab","mossy cobblestone stairs","mossy cobblestone wall","mossy stone brick slab","mossy stone brick stairs","mossy stone brick wall","mossy stone bricks","moving piston","mule spawn egg","mushroom stem","mushroom stew","music disc 11","music disc 13","music disc blocks","music disc cat","music disc chirp","music disc far","music disc mall","music disc mellohi","music disc stal","music disc strad","music disc wait","music disc ward","mutton","mycelium","name tag","nautilus shell","nether brick","nether brick fence","nether brick slab","nether brick stairs","nether brick wall","nether bricks","nether portal","nether quartz ore","nether star","nether wart","nether wart block","netherrack","note block","oak boat","oak button","oak door","oak fence","oak fence gate","oak leaves","oak log","oak planks","oak pressure plate","oak sapling","oak sign","oak slab","oak stairs","oak trapdoor","oak wood","observer","obsidian","ocelot spawn egg","orange banner","orange bed","orange carpet","orange concrete","orange concrete powder","orange dye","orange glazed terracotta","orange shulker box","orange stained glass","orange stained glass pane","orange terracotta","orange tulip","orange wool","oxeye daisy","packed ice","painting","panda spawn egg","paper","parrot spawn egg","peony","petrified oak slab","phantom membrane","phantom spawn egg","pig spawn egg","pillager spawn egg","pink banner","pink bed","pink carpet","pink concrete","pink concrete powder","pink dye","pink glazed terracotta","pink shulker box","pink stained glass","pink stained glass pane","pink terracotta","pink tulip","pink wool","piston","piston head","player head","podzol","poisonous potato","polar bear spawn egg","polished andesite","polished andesite slab","polished andesite stairs","polished diorite","polished diorite slab","polished diorite stairs","polished granite","polished granite slab","polished granite stairs","popped chorus fruit","poppy","porkchop","potato","potatoes","potion","potted acacia sapling","potted allium","potted azure bluet","potted bamboo","potted birch sapling","potted blue orchid","potted brown mushroom","potted cactus","potted cornflower","potted dandelion","potted dark oak sapling","potted dead bush","potted fern","potted jungle sapling","potted lily of the valley","potted oak sapling","potted orange tulip","potted oxeye daisy","potted pink tulip","potted poppy","potted red mushroom","potted red tulip","potted spruce sapling","potted white tulip","potted wither rose","powered rail","prismarine","prismarine brick slab","prismarine brick stairs","prismarine bricks","prismarine crystals","prismarine shard","prismarine slab","prismarine stairs","prismarine wall","pufferfish","pufferfish bucket","pufferfish spawn egg","pumpkin","pumpkin pie","pumpkin seeds","pumpkin stem","purple banner","purple bed","purple carpet","purple concrete","purple concrete powder","purple dye","purple glazed terracotta","purple shulker box","purple stained glass","purple stained glass pane","purple terracotta","purple wool","purpur block","purpur pillar","purpur slab","purpur stairs","quartz","quartz block","quartz pillar","quartz slab","quartz stairs","rabbit","rabbit foot","rabbit hide","rabbit spawn egg","rabbit stew","rail","ravager spawn egg","red banner","red bed","red carpet","red concrete","red concrete powder","red dye","red glazed terracotta","red mushroom","red mushroom block","red nether brick slab","red nether brick stairs","red nether brick wall","red nether bricks","red sand","red sandstone","red sandstone slab","red sandstone stairs","red sandstone wall","red shulker box","red stained glass","red stained glass pane","red terracotta","red tulip","red wool","redstone","redstone block","redstone lamp","redstone ore","redstone torch","redstone wire","repeater","repeating command block","rose bush","rotten flesh","saddle","salmon","salmon bucket","salmon spawn egg","sand","sandstone","sandstone slab","sandstone stairs","sandstone wall","scaffolding","scute","sea lantern","sea pickle","seagrass","shears","sheep spawn egg","shield","shulker box","shulker shell","shulker spawn egg","silverfish spawn egg","skeleton horse spawn egg","skeleton skull","skeleton spawn egg","slime ball","slime block","slime spawn egg","smithing table","smoker","smooth quartz","smooth quartz slab","smooth quartz stairs","smooth red sandstone","smooth red sandstone slab","smooth red sandstone stairs","smooth sandstone","smooth sandstone slab","smooth sandstone stairs","smooth stone","smooth stone slab","snow","snow block","snowball","soul sand","spawner","spectral arrow","spider eye","spider spawn egg","splash potion","sponge","spruce boat","spruce button","spruce door","spruce fence","spruce fence gate","spruce leaves","spruce log","spruce planks","spruce pressure plate","spruce sapling","spruce sign","spruce slab","spruce stairs","spruce trapdoor","spruce wood","squid spawn egg","stick","sticky piston","stone","stone axe","stone brick slab","stone brick stairs","stone brick wall","stone bricks","stone button","stone hoe","stone pickaxe","stone pressure plate","stone shovel","stone slab","stone stairs","stone sword","stonecutter","stray spawn egg","string","stripped acacia log","stripped acacia wood","stripped birch log","stripped birch wood","stripped dark oak log","stripped dark oak wood","stripped jungle log","stripped jungle wood","stripped oak log","stripped oak wood","stripped spruce log","stripped spruce wood","sugar","sugar cane","sunflower","suspicious stew","sweet berries","sweet berry bush","tall grass","tall seagrass","terracotta","tipped arrow","tnt","tnt minecart","torch","totem of undying","trader llama spawn egg","trapped chest","trident","tripwire","tripwire hook","tropical fish","tropical fish bucket","tropical fish spawn egg","tube coral","tube coral block","tube coral fan","turtle egg","turtle helmet","turtle spawn egg","vex spawn egg","villager spawn egg","vindicator spawn egg","vine","wandering trader spawn egg","water","water bucket","wet sponge","wheat","wheat seeds","white banner","white bed","white carpet","white concrete","white concrete powder","white dye","white glazed terracotta","white shulker box","white stained glass","white stained glass pane","white terracotta","white tulip","white wool","witch spawn egg","wither rose","wither skeleton skull","wither skeleton spawn egg","wolf spawn egg","wooden axe","wooden hoe","wooden pickaxe","wooden shovel","wooden sword","writable book","written book","yellow banner","yellow bed","yellow carpet","yellow concrete","yellow concrete powder","yellow dye","yellow glazed terracotta","yellow shulker box","yellow stained glass","yellow stained glass pane","yellow terracotta","yellow wool","zombie head","zombie horse spawn egg","zombie pigman spawn egg","zombie spawn egg","zombie villager spawn egg"};
            String[] mixedup = new String [1];
            mixedup[0] = null;
            String key, match = null;

            try {
                mixedup[0] = (String) clipboard.getData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException | IOException e) {
                e.printStackTrace();
            }

            Map<String, String> lookup = new HashMap<>(jumble.length);
            for (String str : jumble) {
                lookup.put(getKey(str), str);
            }

            for (String mix : mixedup) {
                key = getKey(mix);
                match = lookup.get(key);
                break;
            }
            Toolkit.getDefaultToolkit().getSystemClipboard()
                    .setContents(new StringSelection(match),
                            null);
        }
    }
    public String getKey(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

}
