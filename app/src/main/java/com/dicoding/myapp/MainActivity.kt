package com.dicoding.myapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val articles = listOf(
        Article(R.drawable.sample_image_1, "Sushi", "Sushi is a popular Japanese dish made with vinegared rice, fish, and vegetables.", "Sushi is a traditional Japanese dish that has become popular worldwide, celebrated for its unique blend of flavors, textures, and artful presentation. At its core, sushi consists of vinegared rice (known as shari or sumeshi) combined with other ingredients, most often seafood such as raw fish, but it can also include vegetables, eggs, and occasionally meats. These ingredients are artfully arranged or rolled together, resulting in a dish that is as visually appealing as it is flavorful.\n" +
                "\n" +
                "History and Origins of Sushi\n" +
                "The origins of sushi date back centuries in Japan, where the earliest forms were created as a means of preserving fish. In the original method, known as narezushi, fish was salted and wrapped in fermented rice to keep it from spoiling. Over time, this evolved into oshizushi, where fish was pressed with rice and vinegar. The sushi we know today, however, didn’t take its current form until the Edo period (1603–1868) when nigiri-zushi, or hand-pressed sushi, was introduced in Tokyo. This fast food style of sushi allowed customers to eat quickly on the go, and it eventually became popular across Japan and later, around the world.\n" +
                "\n" +
                "Types of Sushi\n" +
                "Sushi comes in a variety of forms, each with its own method of preparation and presentation:\n" +
                "\n" +
                "1. Nigiri : This is perhaps the most iconic style of sushi, consisting of a small mound of vinegared rice with a slice of fish or seafood, such as tuna or salmon, placed on top. A small amount of wasabi is often applied between the rice and fish, and it’s sometimes served with a strip of nori (seaweed) around it.\n" +
                "\n" +
                "2. Sashimi : Although technically not sushi because it doesn’t include rice, sashimi is often served alongside sushi. It consists of thinly sliced, high-quality raw fish, such as salmon, tuna, or yellowtail, served on its own or with simple garnishes.\n" +
                "\n" +
                "3. Maki : This is a rolled sushi variety where vinegared rice and fillings (such as fish, vegetables, and avocado) are wrapped in a sheet of nori and sliced into bite-sized pieces. Maki rolls can be simple, such as tekka maki (tuna roll), or elaborate, with multiple ingredients.\n" +
                "\n" +
                "4. Uramaki : Often referred to as inside-out rolls, these are rolls where the rice is on the outside and the seaweed wraps around the fillings. This style of sushi became popular in Western countries, with the California Roll being one of the most well-known examples.\n" +
                "\n" +
                "5. Temaki : Also known as hand rolls, temaki is a cone-shaped sushi where the nori is wrapped around the rice and fillings in a way that makes it easy to eat by hand.\n" +
                "\n" +
                "6. Chirashi : Meaning scattered sushi, chirashi is served as a bowl of vinegared rice topped with a colorful assortment of raw fish, vegetables, and other toppings, creating a vibrant and customizable dish.\n" +
                "\n" +
                "Key Ingredients in Sushi\n" +
                "The beauty of sushi lies in the quality and freshness of its ingredients. Each ingredient is chosen carefully to create harmony of flavors:\n" +
                "\n" +
                "- Rice : Sushi rice is short-grain rice seasoned with a mixture of vinegar, sugar, and salt, which gives it a slightly tangy flavor that complements the fish and other toppings.\n" +
                "\n" +
                "- Fish and Seafood : Raw fish, such as tuna, salmon, mackerel, and eel, is the most popular ingredient in sushi. Quality is crucial, with sushi chefs sourcing the freshest fish to ensure both flavor and safety. \n" +
                "\n" +
                "- Nori : This dried seaweed is used to wrap sushi rolls, adding a subtle, slightly salty flavor and a crisp texture.\n" +
                "\n" +
                "- Wasabi : A spicy, green paste made from Japanese horseradish, wasabi adds a unique sharpness that enhances the flavor of the fish. It is often applied between the fish and rice or mixed with soy sauce as a dip.\n" +
                "\n" +
                "- Soy Sauce : This salty condiment is served with sushi for dipping, but should be used sparingly to avoid overwhelming the delicate flavors of the fish.\n" +
                "\n" +
                "- Pickled Ginger (Gari) : This palate cleanser is served alongside sushi to refresh the taste buds between bites, allowing you to fully appreciate the individual flavors of each piece.\n" +
                "\n" +
                "The Art of Sushi-Making\n" +
                "Sushi preparation is both a culinary and an artistic skill. Sushi chefs, or itamae, often spend years mastering techniques for preparing and handling fish, making rice, and assembling ingredients. They focus on knife skills to cut fish precisely, ensuring a melt-in-your-mouth texture, and on hand movements to mold the rice delicately without crushing it. The appearance of the sushi is just as important as its taste, with chefs creating visually appealing arrangements and colorful combinations of ingredients that reflect seasonal elements.\n" +
                "\n" +
                "Cultural Significance and Etiquette\n" +
                "In Japan, sushi is not just a meal but an experience, with customs and etiquette to follow. It is traditionally eaten in a sequence, starting with lighter-tasting white fish and progressing to richer fish like tuna and eel. Nigiri can be eaten by hand, and it’s polite to dip only the fish side into soy sauce to avoid overpowering the rice. \n" +
                "\n" +
                "Sushi represents a balance of simplicity and sophistication. The dish emphasizes fresh, high-quality ingredients that celebrate the natural flavors and textures of each element, while the preparation reflects a dedication to artistry and tradition. Whether enjoyed at a high-end sushi bar or as a quick lunch, sushi is a culinary tradition that continues to captivate people around the world."),
        Article(R.drawable.sample_image_2, "Dimsum", "Dimsum is a Chinese cuisine consisting of small, bite-sized dishes often served with tea.", "Dimsum is a traditional Chinese culinary experience that encompasses a wide variety of small, flavorful dishes meant to be shared. Originating in the southern region of China, particularly in the province of Guangdong, dimsum is typically enjoyed with tea, making it a unique type of meal known as yum cha (tea drinking). The term \"dimsum\" translates roughly to \"touch the heart,\" and this idea is central to the experience, as each dish is crafted to deliver a small, satisfying bite that stimulates the palate.\n" +
                "\n" +
                "A traditional dimsum spread includes a range of bite-sized dishes, each offering a different texture, flavor, and culinary technique. The dishes are served in small bamboo steamers or on small plates and are often brought around the dining room on carts from which diners can choose. Dimsum is popular not only in China but worldwide, especially in areas with large Chinese communities, where it has been adapted and infused with local flavors and ingredients.\n" +
                "\n" +
                "Common Types of Dimsum Dishes\n" +
                "\n" +
                "Dimsum includes an array of dumplings, buns, rolls, and pastries, each with its own distinctive flavor profile and cooking method. Here are some of the classic dishes you’re likely to find at a dim sum restaurant:\n" +
                "\n" +
                "1. Shumai (Siu Mai)  \n" +
                "   Shumai are open-topped dumplings, usually filled with pork, shrimp, or a mixture of the two, along with other ingredients like mushrooms or bamboo shoots. They are steamed to perfection and often garnished with roe or minced carrots.\n" +
                "\n" +
                "2. Har Gow (Shrimp Dumplings)  \n" +
                "   These translucent dumplings have a delicate, chewy wrapper made from rice flour that encases a succulent shrimp filling. Har gow is a dim sum staple, and its preparation requires skill to achieve the perfect balance of thinness and elasticity in the wrapper.\n" +
                "\n" +
                "3. Char Siu Bao (BBQ Pork Buns)  \n" +
                "   These are soft, fluffy buns filled with a sweet and savory barbecue pork filling. Char siu bao come in two variations: steamed, which gives them a soft, moist texture, or baked, which gives them a slightly crusty, golden exterior.\n" +
                "\n" +
                "4. Cheung Fun (Rice Noodle Rolls)  \n" +
                "   Cheung fun are soft, silky rice noodles rolled around fillings like shrimp, beef, or barbecue pork. They’re served with a light soy sauce that enhances the delicate flavor of the rice noodles without overpowering the fillings.\n" +
                "\n" +
                "5. Spring Rolls  \n" +
                "   Dimsum spring rolls are small, golden-brown pastries filled with vegetables or meat, typically deep-fried for a crisp texture. They are often served with a sweet and sour sauce or a spicy dipping sauce.\n" +
                "\n" +
                "6. Turnip Cake (Lo Bak Go)  \n" +
                "   This savory cake is made from grated Chinese turnip (similar to a radish) mixed with rice flour and sometimes includes ingredients like dried shrimp, Chinese sausage, or mushrooms. It’s steamed, sliced, and then pan-fried to create a crispy exterior and soft, creamy interior.\n" +
                "\n" +
                "7. Xiao Long Bao (Soup Dumplings)  \n" +
                "   Although originating from Shanghai, these dumplings have become popular in many dimsum restaurants. Xiao long bao are filled with a mixture of ground pork and hot, savory broth, which is released when you bite into the delicate dumpling skin.\n" +
                "\n" +
                "8. Egg Tarts (Dan Tat)  \n" +
                "   Dimsum meals often end with a dessert, and egg tarts are a popular choice. These tarts consist of a smooth, sweet egg custard baked in a flaky pastry shell, providing a contrast of textures that’s both light and rich.\n" +
                "\n" +
                "The Dimsum Experience\n" +
                "\n" +
                "Dimsum is typically enjoyed in large gatherings, where family or friends can sample a wide array of dishes together. Traditionally served in bustling tea houses, dimsum is often ordered from carts that servers push around the dining area, allowing guests to select dishes as they see them. This interactive style of dining encourages sharing and fosters a lively atmosphere.\n" +
                "\n" +
                "Dimsum is also notable for its yum cha pairing, where tea is served throughout the meal. The choice of tea is important, as it helps to cleanse the palate between bites of flavorful dishes. Popular tea selections include Pu’er (a rich fermented tea), Jasmine (a floral, fragrant tea), and Chrysanthemum (a light, soothing herbal tea).\n" +
                "\n" +
                "Cooking Techniques\n" +
                "\n" +
                "Dimsum dishes are prepared using various cooking methods, including steaming, frying, and baking. The diversity of techniques contributes to the complex, multilayered flavors that define dim sum. Steaming is the most common method, especially for dumplings and buns, as it allows the ingredients to cook gently while retaining their moisture and delicate flavors. Frying, on the other hand, provides a crispy contrast that balances the meal, while baking is often used for pastries and buns.\n" +
                "\n" +
                "Cultural Significance\n" +
                "\n" +
                "Beyond the food, dimsum holds a special cultural significance. It is a social experience as much as it is a meal, rooted in traditions of family bonding and community. Dimsum gatherings are common during weekends and holidays, where families and friends come together to share food, stories, and laughter. The variety of dishes allows diners to sample different flavors, encouraging exploration and conversation.\n" +
                "\n" +
                "Today, dimsum has evolved beyond its Cantonese roots to become a celebrated cuisine worldwide. In places like Hong Kong, dim sum chefs have innovated with creative fillings and unique presentations, blending traditional flavors with modern culinary trends. Whether enjoyed in a high-end restaurant or a local tea house, dim sum continues to be a beloved culinary tradition that celebrates the art of small plates, making it both a satisfying meal and a cherished experience shared among friends and family."),
        Article(R.drawable.sample_image_3, "Pempek", "Pempek is a traditional Indonesian fish cake from Palembang.", "Pempek, also known as empek-empek, is a savory Indonesian fishcake dish originating from Palembang, the capital city of South Sumatra. This beloved delicacy is known for its unique combination of textures and flavors, making it a popular street food and restaurant dish across Indonesia. Pempek is primarily made from fish and tapioca, which gives it a chewy, bouncy texture. The dish is often served with a tangy and slightly sweet vinegar-based sauce called cuko, which adds a refreshing contrast to the rich taste of the fishcake.\n" +
                "\n" +
                "History and Origins\n" +
                "The history of pempek dates back to the early days of trade in Palembang, a city with a strong fishing culture due to its location near the Musi River. Fish was abundant, and locals developed methods to preserve it, eventually discovering the fishcake preparation technique. Pempek likely evolved from Chinese fishcake recipes, modified with local ingredients. Over time, it became synonymous with Palembang’s culinary identity.\n" +
                "\n" +
                "Ingredients\n" +
                "The core ingredients of pempek are fish, tapioca flour, and water, although additional seasonings like salt, sugar, and sometimes garlic are used to enhance the flavor. Traditionally, snakehead fish (ikan gabus) was used, but nowadays, tenggiri (Spanish mackerel) is popular due to its availability and mild flavor. Other types of fish, like sardines or even shrimp, can be used depending on regional variations and personal preferences.\n" +
                "\n" +
                "The Cuko Sauce\n" +
                "The distinctive dipping sauce, cuko, is essential to the pempek experience. Made from palm sugar, vinegar, and garlic, the sauce is simmered until it achieves a balanced blend of sweet, sour, and spicy notes. Bird’s eye chilies are often added for heat, giving the sauce a bold kick. Cuko's acidity complements the fatty richness of the fishcake, creating a harmonious blend that elevates the overall flavor.\n" +
                "\n" +
                "Types of Pempek\n" +
                "Pempek comes in various shapes and fillings, each offering a unique taste and texture. Some popular varieties include:\n" +
                "\n" +
                "1. Pempek Kapal Selam : This large, oval-shaped pempek is stuffed with an egg yolk in the center. The name \"kapal selam\" translates to \"submarine\" in English, inspired by its resemblance to a submerged vessel.\n" +
                "2. Pempek Lenjer : A simple, log-shaped fishcake without any fillings. It’s often cut into pieces and served alongside other varieties.\n" +
                "3. Pempek Adaan : Round, deep-fried pempek balls that are often made with a mixture of fish, garlic, and scallions. Adaan has a slightly crispy exterior and a soft, flavorful center.\n" +
                "4. Pempek Kulit : Made from the skin of the fish, this type of pempek has a stronger fish flavor and a more distinct texture.\n" +
                "5. Pempek Keriting : Shaped like curly noodles or intricate knots, this variety has a chewier texture and is often smaller in size.\n" +
                "\n" +
                "Preparation and Cooking Process\n" +
                "Making pempek involves several steps. The fish is first ground into a smooth paste, then mixed with tapioca flour and seasonings to create a dough-like consistency. This dough is shaped into different forms, depending on the type of pempek being made. The pempek is then either boiled, steamed, or fried, and sometimes undergoes a combination of these methods. For example, pempek kapal selam is boiled to cook the egg inside, then deep-fried to add a crispy outer layer.\n" +
                "\n" +
                "Serving and Eating\n" +
                "Pempek is typically served warm, cut into bite-sized pieces, and drenched in cuko. It is often garnished with fresh cucumber slices and sometimes sprinkled with ebi (dried shrimp powder) to add extra umami. Some regions also serve pempek with yellow noodles as a filling side dish, creating a heartier meal.\n" +
                "\n" +
                "Cultural Significance\n" +
                "In Palembang, pempek is more than just a dish; it's a cultural symbol that has gained nationwide popularity. It’s commonly served during family gatherings, celebrations, and is a popular choice for afternoon snacks. Palembang residents are passionate about their cuko sauce, and many families have their own secret recipes. The popularity of pempek has even led to variations across Indonesia, with each region adding its own twist, such as different spices in the cuko or alternative fish varieties.\n" +
                "\n" +
                "Modern Variations\n" +
                "As Indonesian cuisine continues to evolve, so does pempek. Contemporary chefs have created fusion versions that incorporate Western flavors or unconventional ingredients. For instance, some restaurants may serve pempek with cheese fillings or use other types of seafood. There are also vegan versions that use tofu or mushroom-based fillings to mimic the texture of fish. Despite these innovations, traditional pempek remains the preferred choice for many Indonesians who appreciate its historical and cultural roots.\n" +
                "\n" +
                "Conclusion\n" +
                "Pempek is a unique, flavorful, and deeply cultural Indonesian dish that showcases the country's rich culinary traditions and resources from the sea. Its combination of tender fishcake, chewy tapioca, and tangy, spicy cuko sauce make it a truly memorable dish. Whether enjoyed as a snack or a main course, pempek continues to be a favorite across Indonesia and a must-try for anyone exploring Indonesian cuisine."),
        Article(R.drawable.sample_image_4, "Fruit Pie", "Fruit pie is a dessert with a crust base filled with custard and fresh fruits.", "A fruit pie is a delicious dessert that combines a buttery, flaky crust with a rich filling made from fresh or preserved fruits. It is one of the oldest and most versatile desserts, beloved for its simplicity and ability to highlight the natural flavors of seasonal fruits. Fruit pies come in many varieties, with fillings ranging from sweet to tangy, often sweetened and spiced for added depth. Traditional fruit pies feature popular fruits like apples, berries, peaches, cherries, and plums, but virtually any fruit can be used.\n" +
                "\n" +
                "The pie typically has two crust options: a single crust, where only the bottom is covered, or a double crust, where both the bottom and top of the pie are covered. In a double-crust pie, the top layer can be a solid sheet or a decorative lattice made from interwoven strips of dough. This lattice pattern not only gives the pie a beautiful presentation but also allows steam to escape, preventing the filling from becoming too watery. Some fruit pies also have a crumble or streusel topping, adding a sweet, crispy contrast to the juicy fruit filling.\n" +
                "\n" +
                "The filling is made by mixing cut fruit with sugar and, often, a thickening agent like cornstarch, flour, or tapioca, which helps achieve the ideal consistency as the pie bakes. This thickening process is crucial, as the juices from the fruits release as they cook, and without a thickener, the pie might end up too runny. Spices such as cinnamon, nutmeg, or allspice are common in apple and peach pies, enhancing the warmth of the flavors and adding complexity to the taste. For berry pies, a little lemon zest or juice is sometimes added to bring out the natural sweetness and balance the tartness of the berries.\n" +
                "\n" +
                "Baking a fruit pie involves first blind-baking the crust in some recipes, especially for single-crust pies, to prevent it from becoming soggy. Then the filling is added, and the pie is baked until the crust is golden and the fruit filling is bubbly and thickened. The result is a pie with a crisp, golden-brown crust, tender pieces of fruit, and a luscious, thick sauce surrounding each piece.\n" +
                "\n" +
                "Fruit pies are often served warm, paired with a scoop of vanilla ice cream, a dollop of whipped cream, or a drizzle of cream for a creamy contrast to the warm, sweet filling. The dessert is as versatile as it is delicious, enjoyed year-round and often adapted with different fruits as the seasons change. In the summer, berries, peaches, and plums make refreshing pies, while fall brings about comforting apple, pear, and cranberry pies.\n" +
                "\n" +
                "Whether it’s a rustic homemade pie or an elegant, carefully crafted one, a fruit pie captures the essence of fresh produce and comforting flavors, making it a favorite dessert around the world."),
        Article(R.drawable.sample_image_5, "Waffle", "Waffle is a dough-based breakfast item with a crispy grid texture.", "Waffles are a beloved breakfast food, known for their crispy golden-brown exterior and soft, airy interior, with a characteristic grid pattern that’s perfect for holding syrup, butter, and other delicious toppings. Originating in Europe, waffles have a history dating back to the Middle Ages, with recipes evolving significantly over time. Today, they are enjoyed worldwide and come in many forms, from classic Belgian waffles to crispier versions popular in American diners.\n" +
                "\n" +
                "Types of Waffles\n" +
                "1. Belgian Waffles : Known for their deep pockets, Belgian waffles are usually larger, thicker, and fluffier due to the use of yeast or whipped egg whites in the batter. They are perfect for holding toppings like whipped cream, fruit, and chocolate.\n" +
                "   \n" +
                "2. American Waffles : Typically thinner and denser than Belgian waffles, these waffles have smaller, shallower grid patterns and a crispier texture. They’re often made with baking powder rather than yeast, giving them a quick and easy preparation ideal for breakfast or brunch.\n" +
                "\n" +
                "3. Liège Waffles : Another type of Belgian waffle, Liège waffles are made from a dough rather than a batter and contain pearl sugar, which caramelizes when cooked, creating a delightful crunch and sweetness.\n" +
                "\n" +
                "4. Hong Kong-Style Egg Waffles**: These unique waffles are made in a specialized pan that creates bubble-like pockets, resulting in a soft, chewy texture inside with a crispy outside. They’re often served as a street food and can be enjoyed plain or with various sweet or savory fillings.\n" +
                "\n" +
                "5. Stroopwafels : Originating from the Netherlands, these thin waffle cookies have a layer of caramel syrup in the middle. Stroopwafels are often enjoyed with coffee or tea, where you can place the waffle over your cup to warm it and soften the caramel.\n" +
                "\n" +
                "Ingredients and Preparation\n" +
                "Waffles are typically made from a batter of flour, eggs, milk, sugar, and a leavening agent, such as baking powder or yeast. Variations might include adding vanilla, cinnamon, or even savory ingredients like cheese and herbs. To achieve their signature texture, waffle batter is usually thicker than pancake batter, and when poured into a waffle iron, it creates the distinct pattern and fluffy, yet crispy structure.\n" +
                "\n" +
                "Toppings and Serving Ideas\n" +
                "Waffles are incredibly versatile and can be served with a wide range of toppings. Traditional choices include maple syrup and butter, but there are endless options to explore:\n" +
                "- Fruits : Fresh berries, bananas, or sliced apples add natural sweetness and a refreshing contrast to the warm waffle.\n" +
                "- Creams : Whipped cream, crème fraîche, or even Greek yogurt provide a rich, creamy texture.\n" +
                "- Chocolate or Caramel Sauce : For a dessert-like experience, drizzle chocolate or caramel sauce over your waffle.\n" +
                "- Savory Toppings : Cheese, herbs, fried eggs, and even fried chicken can transform waffles into a hearty, savory dish.\n" +
                "\n" +
                "Nutritional Value\n" +
                "Waffles vary in nutritional content depending on ingredients and preparation. A basic waffle made from flour, milk, and eggs is a good source of carbohydrates and protein, with some essential vitamins and minerals. However, toppings like syrups and whipped cream can add significant calories and sugar, making moderation key.\n" +
                "\n" +
                "Cultural Significance and Modern Popularity\n" +
                "Waffles have gained a cult following worldwide, becoming a popular menu item at breakfast spots and brunch cafes. They also play a role in some cultural traditions; for instance, in Belgium, waffles are a beloved street food, often eaten plain or with light toppings like powdered sugar. In the United States, \"chicken and waffles\" is a Southern staple that combines savory fried chicken with sweet waffles.\n" +
                "\n" +
                "With their versatility, ease of preparation, and wide appeal, waffles have become more than just a breakfast item. Whether enjoyed at home or in a restaurant, waffles continue to be a favorite food for people of all ages."),
        Article(R.drawable.sample_image_6, "Onde-Onde", "Onde-onde is a traditional Indonesian snack made of glutinous rice flour filled with mung bean paste.", "Onde-onde is a beloved traditional Southeast Asian snack that hails from various regions, particularly popular in Indonesia, Malaysia, and the Philippines. This delightful treat, also known in some areas as \"klepon,\" is a small, round, glutinous rice ball filled with a sweet, molten palm sugar syrup at its core. The exterior of onde-onde is coated in freshly grated coconut, giving it a soft and slightly chewy texture with a light, fluffy coating.\n" +
                "\n" +
                "Ingredients and Composition\n" +
                "The main ingredients in onde-onde are glutinous rice flour (sometimes mixed with a bit of tapioca flour for added elasticity), pandan juice or extract, grated coconut, and gula melaka (palm sugar). The glutinous rice flour is kneaded with pandan juice to form a smooth, pliable dough with a light green color and a subtle, fragrant aroma, thanks to the pandan. Pandan not only imparts its green color naturally but also adds a unique floral scent that complements the coconut and palm sugar flavors.\n" +
                "\n" +
                "The filling of onde-onde is a small piece of palm sugar, typically grated and rolled into small balls. When the onde-onde is boiled, this sugar melts into a thick syrup, creating a delightful burst of sweetness when you bite into it. The grated coconut coating provides a pleasant contrast in texture, adding a hint of nuttiness and balancing the sweetness of the palm sugar with a slightly savory note.\n" +
                "\n" +
                "Preparation Process\n" +
                "The preparation of onde-onde requires a few steps but is relatively straightforward. First, the dough is prepared by combining glutinous rice flour with pandan juice until it reaches the right consistency. Small portions of dough are flattened in the hand, and a bit of palm sugar is placed in the center before carefully sealing the dough around it, forming a smooth, round ball. These balls are then boiled in hot water. Once they float to the surface, they are removed and rolled in freshly grated coconut.\n" +
                "\n" +
                "Taste and Texture\n" +
                "The resulting onde-onde has a soft and chewy exterior from the glutinous rice flour dough and a surprise liquid center filled with the rich, caramel-like flavor of palm sugar. The fresh grated coconut adds a layer of creaminess and slight crunch, balancing the dense chewiness of the rice dough and the syrupy filling. Each bite is a unique combination of textures and flavors: earthy, nutty, sweet, and fragrant, making it a true delight.\n" +
                "\n" +
                "Cultural Significance\n" +
                "Onde-onde is more than just a sweet snack; it carries cultural significance in Southeast Asian traditions. Often found in local markets, onde-onde is a popular choice for festive occasions and family gatherings. In some Indonesian and Malaysian cultures, onde-onde is served as part of the traditional \"jajanan pasar\" (market snacks) alongside other traditional cakes and sweets. It represents a connection to heritage and is enjoyed across generations.\n" +
                "\n" +
                "Onde-onde is an excellent example of how simple ingredients—rice, coconut, sugar, and pandan—can come together to create a snack that’s both comforting and intriguing, with layers of flavor that highlight Southeast Asia’s rich culinary history."),
        Article(R.drawable.sample_image_7, "Pizza", "Pizza is an Italian dish made with a flatbread base topped with tomato sauce, cheese, and various toppings.", "Pizza is a beloved and universally recognized dish with a rich history and countless variations, originating from Italy but adapted and enjoyed across the globe. Fundamentally, a pizza consists of a round, flattened dough base, traditionally made from wheat flour, water, yeast, and salt. This dough is kneaded, allowed to rise, and then rolled out or stretched into a thin or thick crust, depending on regional or personal preference. A layer of tomato sauce, typically made from ripe tomatoes, garlic, olive oil, and herbs like basil and oregano, is spread across the dough. This sauce forms the foundation, adding acidity, sweetness, and a burst of fresh flavors.\n" +
                "\n" +
                "One of the essential features of pizza is the layer of cheese, with mozzarella being the classic choice due to its creamy texture and excellent melting qualities. The cheese melts and bubbles when baked, creating a satisfying and gooey texture that complements the flavors of the sauce and toppings. Some variations, like the traditional Neapolitan pizza, adhere strictly to specific ingredients, such as San Marzano tomatoes, fresh mozzarella di bufala, and fresh basil leaves, which together create the iconic Margherita pizza symbolizing the colors of the Italian flag. \n" +
                "\n" +
                "Toppings are another key element, and they vary dramatically based on regional styles and personal taste. They range from classic options like pepperoni, mushrooms, olives, and bell peppers, to more exotic choices like truffle oil, arugula, prosciutto, or even pineapple. In some styles, especially in Italy, pizzas are often kept simple with minimal toppings, allowing the quality of each ingredient to stand out, while in places like the United States, pizzas are known for their more loaded, hearty styles, with a wide variety of meats, cheeses, and vegetables.\n" +
                "\n" +
                "The method of cooking pizza is essential to its texture and flavor. Traditional pizzas are often baked in wood-fired ovens, where intense heat creates a distinctive crispy and charred crust. Other cooking methods include baking in gas or electric ovens, which provide different textures depending on the heat distribution and cooking time. Wood-fired pizza, especially Neapolitan-style, is known for its thin, soft, and slightly chewy crust with a characteristic charred flavor, achieved by the extremely high temperatures, typically around 800-900°F (425-480°C), in just 90 seconds.\n" +
                "\n" +
                "Around the world, pizza has evolved into countless styles, each with unique characteristics. For instance, New York-style pizza is known for its large, thin, and foldable slices, often sold as single servings. Chicago deep-dish pizza, on the other hand, has a thick, buttery crust that resembles more of a pie, with the sauce placed on top of the cheese and toppings to prevent burning during its longer bake time. Detroit-style pizza, a recent favorite, is rectangular, with a thick, airy crust and caramelized cheese edges, achieved by baking in a well-oiled pan. Other popular styles include Sicilian, known for its square shape and thick, bready base, and the lighter, crispier Roman pizza, which is cut into rectangular slices.\n" +
                "\n" +
                "Pizza has become more than just food; it's a cultural icon. In many places, pizza is enjoyed as a communal dish, shared among family and friends, and served at celebrations, parties, and casual gatherings. It has also adapted to dietary preferences and restrictions, with options now available for gluten-free, vegan, and dairy-free pizzas, allowing nearly everyone to enjoy this versatile dish. \n" +
                "\n" +
                "In recent years, artisanal pizza has surged in popularity, with a focus on high-quality ingredients, traditional techniques, and unique flavor pairings. These gourmet pizzas may feature ingredients like burrata cheese, smoked salmon, fig, balsamic reduction, or specialty cured meats, bringing a modern twist to the classic dish."),
        Article(R.drawable.sample_image_8, "Satay", "Satay is an Indonesian grilled skewer made with seasoned meat.", "Satay is a Southeast Asian dish that originated in Indonesia but has become popular across Malaysia, Singapore, Thailand, and other parts of Asia, each adding its unique twist. Satay consists of skewered and grilled meat, commonly served with a rich, flavorful peanut sauce. The dish is celebrated for its blend of savory, sweet, and spicy flavors, making it a staple in street food and home cooking alike.\n" +
                "\n" +
                "Origins and Cultural Significance\n" +
                "The origins of satay trace back to the Indonesian island of Java, where it’s believed to have been influenced by Middle Eastern kebabs brought by Arab traders in the 19th century. Satay has since evolved, becoming a distinct dish in its own right, deeply embedded in the culinary culture of several Asian countries. It's often served during festive occasions, family gatherings, and street markets. In Indonesia, satay is so beloved that each region has its own version, such as Satay Madura, Satay Padang, and Satay Lilit from Bali.\n" +
                "\n" +
                "Ingredients\n" +
                "The meat used in satay can vary widely. Traditional choices include chicken, beef, goat, and lamb, but pork and even seafood like shrimp and fish are also used in some regions. Tofu or tempeh satay is popular among vegetarians. The skewers are typically made from bamboo, which can impart a subtle aroma during grilling.\n" +
                "\n" +
                "The marinade is the heart of satay's flavor, typically featuring a blend of spices like turmeric, coriander, cumin, garlic, lemongrass, and sometimes galangal. These spices not only add depth to the dish but give the meat a vibrant, golden color when grilled. The marinade also includes coconut milk or oil to tenderize the meat and enhance its rich taste.\n" +
                "\n" +
                "Preparation and Cooking Process\n" +
                "1. Marination : The meat is cut into small pieces and marinated in the spice mixture for several hours to ensure it absorbs all the flavors. The turmeric in the marinade gives the meat its characteristic yellowish hue.\n" +
                "2. Skewering : After marination, the meat pieces are threaded onto skewers, usually arranged tightly to retain moisture while grilling.\n" +
                "3. Grilling : The skewers are grilled over a charcoal flame, which adds a smoky flavor and slightly charred exterior, enhancing the dish’s aroma. The grilling process is usually short, ensuring the meat remains tender and juicy inside.\n" +
                "\n" +
                "The Peanut Sauce\n" +
                "The peanut sauce, or \"sambal kacang\" in Indonesian, is what makes satay truly unique. This sauce typically combines roasted or fried peanuts with ingredients like garlic, shallots, red chili peppers, sweet soy sauce (kecap manis), and coconut milk. The result is a thick, creamy sauce with a balance of sweetness, spiciness, and a hint of umami. Some variations of peanut sauce also include tamarind or lime juice for a touch of acidity, while others may add palm sugar for extra sweetness.\n" +
                "\n" +
                "Serving and Variations\n" +
                "Satay is often served with accompaniments that vary by region:\n" +
                "- Rice Cakes : In Indonesia and Malaysia, satay is traditionally served with \"ketupat\" (compressed rice cakes) or \"lontong\" (rice rolled in banana leaves).\n" +
                "- Cucumber and Onion Salad : Fresh cucumber slices, onions, and sometimes a spicy sambal are common sides to balance the richness of the meat and peanut sauce.\n" +
                "- Additional Condiments : Some places serve satay with soy-based dipping sauces, sambal (spicy chili paste), or extra peanuts for garnish.\n" +
                "\n" +
                "Popular Variations Across Regions\n" +
                "- Indonesia : Sate Ayam (chicken), Sate Kambing (goat), and Sate Padang (with a spiced, yellow curry-like sauce) are common.\n" +
                "- Malaysia : Satay here often includes a thicker peanut sauce and is traditionally sweeter, with a touch of honey or sugar in the marinade.\n" +
                "- Thailand : Known as \"Moo Satay,\" Thai satay usually uses pork and is served with a tangy cucumber relish called ajaat.\n" +
                "- Philippines : Called \"Satti,\" Filipino satay is often made with chicken and includes a sweeter sauce, served with rice and sometimes a slightly spicy sauce.\n" +
                "\n" +
                "Nutritional Information\n" +
                "Satay can be high in protein due to the meat content, and the peanut sauce provides healthy fats, protein, and fiber from the peanuts. However, satay can also be high in calories and saturated fats, especially if coconut milk is used in the sauce and marinade.\n" +
                "\n" +
                "Conclusion\n" +
                "Satay is a versatile and beloved dish with deep cultural roots in Southeast Asia. Its unique combination of marinated, smoky meat with a creamy, spicy peanut sauce has made it an iconic representation of the region's cuisine. Whether served as a street snack or a festive main dish, satay continues to delight food lovers with its bold, complex flavors and regional variations."),
        Article(R.drawable.sample_image_9, "Burger", "Burger is a sandwich made with a beef patty, lettuce, and various toppings.", "A burger, or hamburger, is a popular, hearty meal typically made with a ground meat patty sandwiched between two halves of a round, soft bun. It's often complemented by an assortment of fresh toppings and condiments, each of which adds unique flavors and textures to the overall experience. Traditionally, burgers are made with beef, but they’ve evolved to include a wide variety of options, such as chicken, turkey, lamb, fish, and plant-based alternatives, catering to various dietary preferences.\n" +
                "\n" +
                "The foundation of a classic burger begins with the meat patty, which is often seasoned with salt, pepper, and other spices before being cooked to a desirable level of doneness—ranging from rare to well-done. Once grilled, pan-fried, or charbroiled, the patty develops a savory crust on the outside while remaining juicy within. The patty is placed on a soft, sometimes toasted bun that provides a mild sweetness, offering a complementary backdrop to the more intense flavors of the fillings.\n" +
                "\n" +
                "Layered on top of the patty are the toppings, which typically include crisp lettuce, thick slices of juicy tomatoes, fresh or grilled onions, and tangy pickles. Cheese is a frequent addition, with varieties like cheddar, American, Swiss, or pepper jack, which melt over the hot patty, creating a creamy texture and rich flavor. For those who enjoy extra flavors, bacon strips add a smoky, salty crunch, while mushrooms, avocado, or jalapeños can bring unique textures and tastes. \n" +
                "\n" +
                "Condiments play a crucial role in enhancing the burger’s flavor profile. Ketchup provides a sweet and tangy element, while mustard introduces a zesty sharpness. Mayonnaise adds a creamy richness, and special sauces—such as aioli, barbecue sauce, or even spicy Sriracha blends—can take the burger’s taste to new levels. \n" +
                "\n" +
                "The modern burger has also been reimagined with countless variations to suit a diverse array of palates. Gourmet burgers may use artisanal buns, like brioche or ciabatta, and unique toppings like truffle aioli, caramelized onions, arugula, or blue cheese. For vegetarians and vegans, plant-based patties made from ingredients like black beans, chickpeas, quinoa, or soy provide a satisfying alternative to meat.\n" +
                "\n" +
                "Burgers are often accompanied by sides like crispy French fries, onion rings, or coleslaw, and they can be paired with a cold beverage, such as soda, beer, or a milkshake, to create a classic, satisfying meal. Beyond just food, burgers have become a cultural staple, symbolizing casual dining and culinary creativity. Whether enjoyed at a backyard barbecue, a fast-food restaurant, or a gourmet eatery, the burger remains a versatile, beloved dish worldwide."),
        Article(R.drawable.sample_image_10, "Baso Aci", "Baso Aci is an Indonesian street food made from chewy tapioca balls in a savory broth.", "Baso Aci is a popular street food dish from Indonesia, particularly associated with the culinary culture of West Java, specifically the city of Bandung. The term \"baso\" or \"bakso\" generally refers to meatballs in Indonesia, while \"aci\" means \"tapioca\" in Sundanese, a language commonly spoken in West Java. As a result, Baso Aci is a unique dish consisting of chewy, tapioca-based balls, making it distinct from the more widely known meat-based bakso.\n" +
                "\n" +
                "Ingredients and Flavor Profile\n" +
                "\n" +
                "The main ingredient in Baso Aci is tapioca flour, which gives the dish its characteristic chewy texture. Tapioca is mixed with seasonings and hot water to form a dough, then shaped into balls and boiled. Some variations include small amounts of minced meat, shrimp, or fish paste to add flavor, but the core of the dish is primarily tapioca, giving it a unique texture that is often described as “al dente” or “bouncy.”\n" +
                "\n" +
                "To enhance the dish, the tapioca balls are served in a flavorful, savory broth. This broth is typically made from beef or chicken stock and seasoned with a blend of Indonesian spices, such as garlic, shallots, chili, lemongrass, and sometimes a hint of lime for a slightly sour tang. The addition of chili makes it a spicy dish, although the heat level can often be adjusted depending on taste. \n" +
                "\n" +
                "Variations and Toppings\n" +
                "\n" +
                "Baso Aci has many popular variations and add-ins that elevate its flavor and texture. Here are some of the common elements often included in Baso Aci:\n" +
                "\n" +
                "- Tahu Baso (Tofu with Meat Filling) : Fried tofu stuffed with a bit of meat paste, usually served alongside the tapioca balls.\n" +
                "- Ceker Ayam (Chicken Feet) : A common street food item in Indonesia, chicken feet are often slow-cooked in the broth until tender, absorbing the dish’s rich flavors.\n" +
                "- Sukro and Krupuk Mie (Crispy Crackers) : These crunchy toppings add texture contrast to the chewy tapioca balls and are typically added right before serving.\n" +
                "- Pilihan Sambal (Choice of Chili Paste) : To adjust the spice level, sellers often provide sambal or chili paste on the side, allowing the customer to control the heat.\n" +
                "- Lime and Scallions : These garnishes are used to brighten the broth and add freshness to the dish.\n" +
                "\n" +
                "Some vendors or home recipes also include cireng (fried tapioca-based snacks), small meatballs, or egg yolks to enhance the dish. \n" +
                "\n" +
                "Serving Style and Popularity\n" +
                "\n" +
                "Baso Aci is often sold from street carts or small food stalls in Indonesia and is also popular as a packaged food that can be easily prepared at home by adding hot water. Street vendors serve it in a small bowl, and the experience of eating it is part of its charm. With each spoonful, you get a mouthful of the rich, savory broth and a variety of chewy, crispy, and tender textures from the mix of toppings.\n" +
                "\n" +
                "Cultural Significance and Appeal\n" +
                "\n" +
                "Baso Aci has become more than just a street snack; it’s a popular comfort food that is enjoyed by people of all ages. Its popularity has soared over recent years, and it has gained fans across Indonesia. The dish appeals to many because it brings a sense of nostalgia, often reminding people of the food culture of Bandung and West Java. Many Indonesians crave it as a late-night snack or as a rainy-day comfort food because of its warm, spicy, and satisfying flavor profile.\n" +
                "\n" +
                "Modern Innovations and Trends\n" +
                "\n" +
                "In recent years, Baso Aci has also been modernized and adapted to suit different tastes. Some vendors offer versions with additional cheese, while others experiment with more gourmet toppings. Its popularity has also led to a packaged \"instant Baso Aci\" that allows people to make the dish at home by simply adding hot water. This instant variety often includes vacuum-sealed tapioca balls, seasonings, and small packets of sambal, enabling people to enjoy Baso Aci conveniently and quickly.\n" +
                "\n" +
                "Summary\n" +
                "\n" +
                "Baso Aci is a beloved Indonesian street food dish that combines chewy tapioca balls with a spicy, savory broth and various flavorful toppings. It’s a dish that brings together unique textures and a rich taste, representing the culinary traditions of West Java while also evolving with modern twists. Whether enjoyed on the street, at home from a packaged version, or in trendy cafés, Baso Aci continues to be a popular, comforting dish that holds a special place in Indonesian cuisine.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = ArticleAdapter(articles) { article ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("EXTRA_TITLE", article.title)
                putExtra("EXTRA_DESCRIPTION", article.description)
                putExtra("EXTRA_IMAGE", article.imageResId)
            }
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
