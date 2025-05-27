// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IRectangle
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata

/**
 * An implementation of the [IReshapeHandler] interface that can be used to constrain the reshaping of an existing instance conveniently.
 * @see [ConstrainedHandle]
 * @see [ConstrainedPositionHandler]
 * @see [constrainNewBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ConstrainedReshapeHandler] class that delegates to the `wrappedHandler`.
 * @param [wrappedHandler] The handler to wrap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-constructor-ConstrainedReshapeHandler">Online Documentation</a>
 * 
 * @property wrappedHandler
 * Gets the wrapped handler to which calls will be ultimately delegated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23wrappedHandler">Online Documentation</a>
 */
external abstract class ConstrainedReshapeHandler 
protected constructor (
protected final val wrappedHandler: IReshapeHandler) : IReshapeHandler {

/**
 * Gets the [wrappedHandler]'s [IReshapeHandler.bounds] property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23bounds">Online Documentation</a>
 */
final override val bounds: IRectangle
/**
 * Cancels the move operation and calls [onCanceled]
 * @param [context] The context to retrieve information about the drag from.
 * @param [originalBounds] The value of the coordinate of the [bounds] property at the time of [initializeReshape].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-cancelReshape">Online Documentation</a>
 */
 final override   fun cancelReshape( context: IInputModeContext ,
 originalBounds: Rect )
/**
 * Applies the constraints for the new bounds.
 * @param [context] The context in which the reshape will be performed.
 * @param [originalBounds] The value of the [bounds] property at the time of [initializeReshape].
 * @param [newBounds] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [bounds] may or may not be modified to reflect the new value.
 * @return The constrained value of `newBounds`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-constrainNewBounds">Online Documentation</a>
 */
 abstract protected   fun constrainNewBounds( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect ):Rect
/**
 * Handles the reshape operation and subsequently calls [onReshaped]
 * @param [context] The context in which the reshape will be performed.
 * @param [originalBounds] The value of the [bounds] property at the time of [initializeReshape].
 * @param [newBounds] The coordinates in the world coordinate system that the client wants to reshape the item to. Depending on the implementation the [bounds] may or may not be modified to reflect the new value.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-handleReshape">Online Documentation</a>
 */
 final override   fun handleReshape( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect )
/**
 * Initializes the reshape operation and subsequently calls [onInitialized]
 * @param [context] The context in which the drag will be performed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-initializeReshape">Online Documentation</a>
 */
 final override   fun initializeReshape( context: IInputModeContext )
/**
 * Called when the [cancelReshape] method has been called.
 * @param [context] The input mode context.
 * @param [originalBounds] The original bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled( context: IInputModeContext ,
 originalBounds: Rect )
/**
 * Called when the [reshapeFinished] method has been called.
 * @param [context] The input mode context.
 * @param [originalBounds] The original bounds.
 * @param [newBounds] The new bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-onFinished">Online Documentation</a>
 */
 open protected   fun onFinished( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect )
/**
 * Called when the [initializeReshape] method has been called.
 * @param [context] The input mode context.
 * @param [originalBounds] The original bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-onInitialized">Online Documentation</a>
 */
 open protected   fun onInitialized( context: IInputModeContext ,
 originalBounds: Rect )
/**
 * Called when the [handleReshape] operation has been performed.
 * @param [context] The input mode context.
 * @param [originalBounds] The original Bounds.
 * @param [newBounds] The new Bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-onReshaped">Online Documentation</a>
 */
 open protected   fun onReshaped( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect )
/**
 * Handles the finish operation and invokes [onFinished]
 * @param [context] The context to retrieve information about the drag from.
 * @param [originalBounds] The value of the [bounds] property at the time of [initializeReshape].
 * @param [newBounds] The coordinates in the world coordinate system that the client wants the handle to be at. Depending on the implementation the [bounds] may or may not be modified to reflect the new value. This is the same value as delivered in the last invocation of [handleReshape]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConstrainedReshapeHandler%23ConstrainedReshapeHandler-method-reshapeFinished">Online Documentation</a>
 */
 final override   fun reshapeFinished( context: IInputModeContext ,
 originalBounds: Rect ,
 newBounds: Rect )

companion object : ClassMetadata<ConstrainedReshapeHandler> {
}
}
