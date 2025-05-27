// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.IBend
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface that can be used to find bends at specific locations in the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendSelectionTester">Online Documentation</a>
 */
external interface IBendSelectionTester : YObject {
/**
 * Returns the bends within the given rectangle.
 * @param [context] The input mode context to use for querying the position.
 * @param [rectangle] A rectangle in world coordinates.
 * @return The bends inside of `rectangle`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendSelectionTester%23IBendSelectionTester-method-getBendsInBox">Online Documentation</a>
 */
   fun getBendsInBox( context: IInputModeContext ,
 rectangle: Rect ):IEnumerable<IBend>
/**
 * Returns the bend at the given world coordinate position.
 * @param [context] The input mode context to use for querying the position.
 * @param [location] A location in world coordinates.
 * @return The bend at the position or `null` if there is no bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IBendSelectionTester%23IBendSelectionTester-method-getHitBend">Online Documentation</a>
 */
   fun getHitBend( context: IInputModeContext ,
 location: Point ):IBend?

companion object : InterfaceMetadata<IBendSelectionTester> {
}
}
