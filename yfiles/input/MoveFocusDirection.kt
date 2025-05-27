// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration used by [NavigationInputMode] to determine the direction of the search for items to navigate to.
 * @see [NavigationInputMode]
 * @see [NavigationInputMode.moveTo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection">Online Documentation</a>
 */
external sealed class MoveFocusDirection: YEnum<MoveFocusDirection> {
   companion object: EnumMetadata<MoveFocusDirection> {
       /**
 * No direction.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23NONE">Online Documentation</a>
 */
val NONE: MoveFocusDirection

/**
 * In the direction of the negative x Axis.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23LEFT">Online Documentation</a>
 */
val LEFT: MoveFocusDirection

/**
 * In the direction of the positive x Axis.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23RIGHT">Online Documentation</a>
 */
val RIGHT: MoveFocusDirection

/**
 * In the direction of the negative y Axis.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23UP">Online Documentation</a>
 */
val UP: MoveFocusDirection

/**
 * In the direction of the positive y Axis.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23DOWN">Online Documentation</a>
 */
val DOWN: MoveFocusDirection

/**
 * In the direction of the [parent][yfiles.graph.IGraph.setParent] in the grouped graph.
 * 
 * Value - `5`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23PARENT">Online Documentation</a>
 */
val PARENT: MoveFocusDirection

/**
 * In the direction of the [children][yfiles.graph.IGraph.getChildren] in the grouped graph.
 * 
 * Value - `6`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveFocusDirection%23CHILD">Online Documentation</a>
 */
val CHILD: MoveFocusDirection
   }
}
