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
import yfiles.lang.InterfaceMetadata

/**
 * Interface for an object that can handle the position of an item displayed in a [CanvasComponent][yfiles.view.CanvasComponent]
 * @see [IDragHandler]
 * @see [IHandle]
 * @see [MoveInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPositionHandler">Online Documentation</a>
 */
external interface IPositionHandler : IDragHandler {

companion object : InterfaceMetadata<IPositionHandler> {
/**
 * Creates a generic composite implementation for the [IPositionHandler] interface.
 * @param [handlers] The handlers to create the composite from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPositionHandler%23IPositionHandler-defaultmethod-combine(IEnumerable)">Online Documentation</a>
 */
@JsName("combine")
  operator fun invoke( handlers: IEnumerable<IPositionHandler> ):IPositionHandler
/**
 * Creates a generic composite implementation for the [IPositionHandler] interface.
 * @param [handlers] The handlers to create the composite from.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPositionHandler%23IPositionHandler-defaultmethod-combine(IPositionHandler[])">Online Documentation</a>
 */
@JsName("combine")
  operator fun invoke(vararg  handlers: IPositionHandler ):IPositionHandler
}
}
