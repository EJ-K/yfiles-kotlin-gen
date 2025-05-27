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
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * Specialized input mode that is used to resize a stripe by dragging one of its borders.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-constructor-ResizeStripeInputMode">Online Documentation</a>
 */
external open class ResizeStripeInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets or sets the event recognizer that determines whether to cancel the resize operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23cancelRecognizer">Online Documentation</a>
 */
final var cancelRecognizer: EventRecognizer
/**
 * Gets or sets the cursor to use when a column cannot be resized to current mouse position.
 * 
 * The default value is [Cursor.NOT_ALLOWED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23columnInvalidEndCursor">Online Documentation</a>
 */
final var columnInvalidEndCursor: Cursor?
/**
 * Gets or sets the cursor to use while resizing columns.
 * 
 * The default value is [Cursor.COL_RESIZE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23columnResizeCursor">Online Documentation</a>
 */
final var columnResizeCursor: Cursor?
/**
 * Gets or sets the cursor to use while hovering over the border of a column that may be resized.
 * 
 * The default value is [Cursor.COL_RESIZE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23columnValidBeginCursor">Online Documentation</a>
 */
final var columnValidBeginCursor: Cursor?
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the event recognizer that determines whether to move a handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23draggedRecognizer">Online Documentation</a>
 */
final var draggedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to move a handle via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23draggedRecognizerTouch">Online Documentation</a>
 */
final var draggedRecognizerTouch: EventRecognizer
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * Gets or sets the event recognizer that determines whether to ignore the content of all stripes instead of moving them or considering for minimum sizes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ignoreContentRecognizer">Online Documentation</a>
 */
final var ignoreContentRecognizer: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets a value indicating whether a drag operation is currently in progress.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23isDragging">Online Documentation</a>
 */
final val isDragging: Boolean
/**
 * Gets or sets the event recognizer that determines whether to start resizing the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23pressedRecognizer">Online Documentation</a>
 */
final var pressedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to start resizing the stripe via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23pressedRecognizerTouch">Online Documentation</a>
 */
final var pressedRecognizerTouch: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets the event recognizer that determines whether to finish resizing the stripe.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23releasedRecognizer">Online Documentation</a>
 */
final var releasedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to finish resizing the stripe via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23releasedRecognizerTouch">Online Documentation</a>
 */
final var releasedRecognizerTouch: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to resize adjacent stripes instead of moving them.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23resizeNeighborsRecognizer">Online Documentation</a>
 */
final var resizeNeighborsRecognizer: EventRecognizer
/**
 * Gets or sets the cursor to use when a row cannot be resized to current mouse position.
 * 
 * The default value is [Cursor.NOT_ALLOWED]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23rowInvalidEndCursor">Online Documentation</a>
 */
final var rowInvalidEndCursor: Cursor?
/**
 * Gets or sets the cursor to use while resizing rows.
 * 
 * The default value is [Cursor.ROW_RESIZE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23rowResizeCursor">Online Documentation</a>
 */
final var rowResizeCursor: Cursor?
/**
 * Gets or sets the cursor to use while hovering over the border of a row that may be resized.
 * 
 * The default value is [Cursor.ROW_RESIZE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23rowValidBeginCursor">Online Documentation</a>
 */
final var rowValidBeginCursor: Cursor?
/**
 * Cancels the editing of this mode.
 * @see [onCanceled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called to determine whether it is valid to begin the gesture
 * @return true iff a stripe border has been hit at the latest [MouseEventArgs][yfiles.view.MouseEventArgs]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-isValidBegin">Online Documentation</a>
 */
 open protected   fun isValidBegin( source: IEventDispatcher ,
 event: EventArgs ):Boolean
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Triggers the [DragCanceled] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragCanceled">Online Documentation</a>
 */
 open protected   fun onDragCanceled( event: InputModeEventArgs )
/**
 * Triggers the [DragCanceling] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragCanceling">Online Documentation</a>
 */
 open protected   fun onDragCanceling( event: InputModeEventArgs )
/**
 * Called once the drag has been finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragFinished">Online Documentation</a>
 */
 open protected   fun onDragFinished( event: InputModeEventArgs )
/**
 * Called before the drag will be finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragFinishing">Online Documentation</a>
 */
 open protected   fun onDragFinishing( event: InputModeEventArgs )
/**
 * Triggers the [DragStarted] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragStarted">Online Documentation</a>
 */
 open protected   fun onDragStarted( event: InputModeEventArgs )
/**
 * Triggers the [DragStarting] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragStarting">Online Documentation</a>
 */
 open protected   fun onDragStarting( event: InputModeEventArgs )
/**
 * Called at the end of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragged">Online Documentation</a>
 */
 open protected   fun onDragged( event: InputModeEventArgs )
/**
 * Called at the start of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragging">Online Documentation</a>
 */
 open protected   fun onDragging( event: InputModeEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragFinishing">Online Documentation</a>
 */
fun addDragFinishingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragFinishingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragFinished">Online Documentation</a>
 */
fun addDragFinishedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragFinishedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragStarting">Online Documentation</a>
 */
fun addDragStartingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragStartingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragStarted">Online Documentation</a>
 */
fun addDragStartedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragStartedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23Dragging">Online Documentation</a>
 */
fun addDraggingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23Dragged">Online Documentation</a>
 */
fun addDraggedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragCanceled">Online Documentation</a>
 */
fun addDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragCanceling">Online Documentation</a>
 */
fun addDragCancelingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCancelingListener(listener: EventHandler1<InputModeEventArgs>)

companion object : ClassMetadata<ResizeStripeInputMode> {
}
}

inline fun ResizeStripeInputMode(
    block: ResizeStripeInputMode.() -> Unit
): ResizeStripeInputMode {
    return ResizeStripeInputMode()
        .apply(block)
}

/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragFinishing">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragFinishingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragFinishingListener(listener)
    return { removeDragFinishingListener(listener) }
}
/**
 * Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragFinished">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragFinishedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragFinishedListener(listener)
    return { removeDragFinishedListener(listener) }
}
/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragStarting">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragStartingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragStartingListener(listener)
    return { removeDragStartingListener(listener) }
}
/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragStarted">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragStartedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragStartedListener(listener)
    return { removeDragStartedListener(listener) }
}
/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23Dragging">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDraggingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggingListener(listener)
    return { removeDraggingListener(listener) }
}
/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23Dragged">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDraggedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggedListener(listener)
    return { removeDraggedListener(listener) }
}
/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragCanceled">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragCanceledHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCanceledListener(listener)
    return { removeDragCanceledListener(listener) }
}
/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23DragCanceling">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragCancelingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCancelingListener(listener)
    return { removeDragCancelingListener(listener) }
}
