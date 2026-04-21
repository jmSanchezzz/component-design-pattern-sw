# Restaurant Menu Composite Pattern

## Problem Statement
Restaurant menus often contain both individual items (for example, a burger or drink) and grouped meal bundles (for example, a solo meal). The challenge is to model these structures in a way that treats single items and item groups uniformly when printing menu details and computing total price.

This project solves that problem using the Composite Design Pattern in Java. Leaf nodes represent individual menu items with fixed prices, while composite nodes represent menu categories or meal bundles that can contain other components. This allows the app to build nested menus, print them in a readable format, and compute total menu value through a single common interface.