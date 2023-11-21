# :busts_in_silhouette: Friends List App

## MainActivity :memo:
`MainActivity` serves as the primary interface of the app, displaying a list of friends' names.

### Key Components
- **ListView**: A view group that displays a list of scrollable items.

### Functionality
- Initializes a String array `friends` containing names.
- Creates an `ArrayAdapter<String>` to populate the ListView with names from the array.
- Sets the custom adapter to the ListView to display the names.

## XML Layouts :bookmark_tabs:
### MainActivity Layout (`activity_main.xml`)
- Defines a `ConstraintLayout` containing a `ListView`.
- The `ListView` is set to match the parent's constraints, filling the screen.

### Item View Layout (`item_view.xml`)
- A `ConstraintLayout` with a single `TextView`.
- `TextView` is styled with bold text, a specific text size, and a custom text color.
- The layout and text style are designed to enhance readability.

## Our App 📷
![image](https://github.com/pmoschos/CustomListViewApp01/assets/133533759/e8827906-0259-4ad1-84e1-8823dea6f4da)

## Conclusion :checkered_flag:
This app demonstrates a simple yet effective use of a ListView in Android, displaying a list of names. It provides a basic template for creating list-based UIs, showcasing how to bind an ArrayAdapter to a ListView for displaying data.

<h1 align=center>Happy Coding 👨‍💻 </h1>

<p align="center">
  Made with ❤️ by Panagiotis Moschos (https://github.com/pmoschos)
</p>
