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
import yfiles.view.Cursor

/**
 * An implementation of the [IHandle] interface that can be used to constrain the handle of an item.
 * @see [ConstrainedDragHandler]
 * @see [ConstrainedDragHandler.constrainNewLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedHandle">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ConstrainedHandle] class that delegates to the `wrappedHandle`.
 * @param [wrappedHandle] The handle to wrap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedHandle%23ConstrainedHandle-constructor-ConstrainedHandle">Online Documentation</a>
 */
external abstract class ConstrainedHandle 
protected constructor ( wrappedHandle: IHandle ) : ConstrainedDragHandler<IHandle>, IHandle {

/**
 * Gets the [ConstrainedDragHandler.wrappedHandler]'s [IHandle.cursor] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedHandle%23cursor">Online Documentation</a>
 */
override val cursor: Cursor
/**
 * Gets the [ConstrainedDragHandler.wrappedHandler]'s [IHandle.type] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedHandle%23type">Online Documentation</a>
 */
override val type: HandleTypes
/**
 * Calls the [ConstrainedDragHandler.wrappedHandler]'s [IHandle.handleClick] method.
 * @param [event] Arguments describing the click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedHandle%23ConstrainedHandle-method-handleClick">Online Documentation</a>
 */
 override   fun handleClick( event: ClickEventArgs )

companion object : ClassMetadata<ConstrainedHandle> {
}
}
