// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * A specialized version of the [IHandleProvider] interface that can be used to query [IHandle] implementation for resizing an object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandleProvider">Online Documentation</a>
 */
external interface IReshapeHandleProvider : YObject {
/**
 * Returns a bitwise combination of all of the [HandlePositions] this interface can provide an implementation for.
 * @param [context] The context for which the handles are queried.
 * @return A bitwise combination of all positions the [getHandle] method can be queried for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandleProvider%23IReshapeHandleProvider-method-getAvailableHandles">Online Documentation</a>
 */
   fun getAvailableHandles( context: IInputModeContext ):HandlePositions
/**
 * Returns an implementation of an [IHandle] for the given position, that can be used to reshape an object.
 * @param [context] The context for which the handles are queried.
 * @param [position] The single position a handle implementation should be returned for.
 * @return An implementation of [IHandle] for the given position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IReshapeHandleProvider%23IReshapeHandleProvider-method-getHandle">Online Documentation</a>
 */
   fun getHandle( context: IInputModeContext ,
 position: HandlePositions ):IHandle

companion object : InterfaceMetadata<IReshapeHandleProvider> {
}
}
