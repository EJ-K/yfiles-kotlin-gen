// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.lang.ClassMetadata

/**
 * An implementation of the [IPositionHandler] interface that can be used to constrain the position of an item.
 * @see [ConstrainedDragHandler]
 * @see [ConstrainedDragHandler.constrainNewLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedPositionHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ConstrainedPositionHandler] class that delegates to the `wrappedHandler`.
 * @param [wrappedHandler] The handler to wrap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedPositionHandler%23ConstrainedPositionHandler-constructor-ConstrainedPositionHandler">Online Documentation</a>
 */
abstract external class ConstrainedPositionHandler protected constructor(
  wrappedHandler: IPositionHandler,
) : ConstrainedDragHandler<IPositionHandler>, IPositionHandler {
  
  companion object : ClassMetadata<ConstrainedPositionHandler> {
  }
}
