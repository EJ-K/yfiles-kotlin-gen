// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.promise.Promise
import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * Generic [IInputMode] implementation that can be used to move something in the canvas using the mouse.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [MoveInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-constructor-MoveInputMode">Online Documentation</a>
 */
external open class MoveInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets an immutable snapshot of the [IModelItem]s affected by the currently [active][isDragging] gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23affectedItems">Online Documentation</a>
 */
final val affectedItems: IEnumerable<IModelItem>
/**
 * Gets or sets the event recognizer that determines whether to cancel the move.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23cancelRecognizer">Online Documentation</a>
 */
final var cancelRecognizer: EventRecognizer
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the event recognizer that determines whether to temporarily disable snapping.
 * @see [enableSnappingRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23disableSnappingRecognizer">Online Documentation</a>
 */
final var disableSnappingRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to move the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23draggedRecognizer">Online Documentation</a>
 */
final var draggedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to move the selection via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23draggedRecognizerTouch">Online Documentation</a>
 */
final var draggedRecognizerTouch: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to reenable temporarily disabled snapping.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23enableSnappingRecognizer">Online Documentation</a>
 */
final var enableSnappingRecognizer: EventRecognizer
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * Gets or sets the [IHitTestable] that will be used by this mode to determine where the user may start dragging.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23hitTestable">Online Documentation</a>
 */
final var hitTestable: IHitTestable
/**
 * Gets or sets the event recognizer that determines whether to the user is hovering over an item where pressing can initialize a move operation.
 * 
 * The default implementation uses the [isValidStartLocation] method to determine whether the mode can be initialized, here.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23hoverRecognizer">Online Documentation</a>
 */
final var hoverRecognizer: EventRecognizer
/**
 * Gets the initial position where the dragging was initiated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23initialLocation">Online Documentation</a>
 */
final val initialLocation: Point
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets a value indicating whether a drag operation is currently in progress.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23isDragging">Online Documentation</a>
 */
final val isDragging: Boolean
/**
 * Gets or sets the cursor to use while moving items.
 * 
 * The default cursor is [Cursor.MOVE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23moveCursor">Online Documentation</a>
 */
final var moveCursor: Cursor?
/**
 * Gets or sets the [IPositionHandler] that will be used as fallback to handle that actual movement of the elements during the drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23positionHandler">Online Documentation</a>
 */
final var positionHandler: IPositionHandler?
/**
 * Gets or sets the event recognizer that determines whether to start moving the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23pressedRecognizer">Online Documentation</a>
 */
final var pressedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to start moving the selection via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23pressedRecognizerTouch">Online Documentation</a>
 */
final var pressedRecognizerTouch: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets the event recognizer that determines whether to finish moving the selection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23releasedRecognizer">Online Documentation</a>
 */
final var releasedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to finish moving the selection via touch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23releasedRecognizerTouch">Online Documentation</a>
 */
final var releasedRecognizerTouch: EventRecognizer
/**
 * Gets or sets the [snapContext] which manages snapping model items to certain coordinates (for instance, other items).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23snapContext">Online Documentation</a>
 */
final var snapContext: SnapContext?
/**
 * Gets or sets the cursor to use while hovering above items that may be moved.
 * 
 * The default cursor is [Cursor.MOVE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23validBeginCursor">Online Documentation</a>
 */
final var validBeginCursor: Cursor?
/**
 * Called when this mode is "armed".
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-arm">Online Documentation</a>
 */
 open protected   fun arm()
/**
 * Cancels the editing of this mode.
 * @see [onCanceled]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Creates an [IInputModeContext] for use with the [IPositionHandler] interface for the upcoming drag operation.
 * @return An instance of [IInputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-createPositionHandlerInputModeContext">Online Documentation</a>
 */
 open protected   fun createPositionHandlerInputModeContext():IInputModeContext
/**
 * Called when this mode is "disarmed".
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-disarm">Online Documentation</a>
 */
 open protected   fun disarm()
/**
 * Simulates the start of a drag and puts the state machine into the dragging state.
 * @param [location] The location where the drag had been initialized.
 * @return A task that represents the asynchronous drag operation. The result of the task contains the affected items or `null` if the drag was canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-doStartDrag">Online Documentation</a>
 */
 open   fun doStartDrag( location: Point ):Promise<IEnumerable<IModelItem>?>
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Determines whether the given location is a valid start location for the move gesture.
 * @param [location] The location in the world coordinate system.
 * @return `true` if at the given location it is valid to start the move gesture; otherwise, `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-isValidStartLocation">Online Documentation</a>
 */
 open protected   fun isValidStartLocation( location: Point ):Boolean
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Triggers the [DragCanceled] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragCanceled">Online Documentation</a>
 */
 open protected   fun onDragCanceled( event: InputModeEventArgs )
/**
 * Triggers the [DragCanceling] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragCanceling">Online Documentation</a>
 */
 open protected   fun onDragCanceling( event: InputModeEventArgs )
/**
 * Called once the drag has been finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragFinished">Online Documentation</a>
 */
 open protected   fun onDragFinished( event: InputModeEventArgs )
/**
 * Called before the drag will be finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragFinishing">Online Documentation</a>
 */
 open protected   fun onDragFinishing( event: InputModeEventArgs )
/**
 * Triggers the [DragStarted] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragStarted">Online Documentation</a>
 */
 open protected   fun onDragStarted( event: InputModeEventArgs )
/**
 * Triggers the [DragStarting] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragStarting">Online Documentation</a>
 */
 open protected   fun onDragStarting( event: InputModeEventArgs )
/**
 * Called at the end of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragged">Online Documentation</a>
 */
 open protected   fun onDragged( event: InputModeEventArgs )
/**
 * Called at the start of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragging">Online Documentation</a>
 */
 open protected   fun onDragging( event: InputModeEventArgs )
/**
 * Raises the [QueryPositionHandler] event.
 * @param [event] The [QueryPositionHandlerEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onQueryPositionHandler">Online Documentation</a>
 */
 open protected   fun onQueryPositionHandler( event: QueryPositionHandlerEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when a drag is recognized for the [MoveInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23QueryPositionHandler">Online Documentation</a>
 */
fun addQueryPositionHandlerListener(listener: EventHandler1<QueryPositionHandlerEventArgs>)
fun removeQueryPositionHandlerListener(listener: EventHandler1<QueryPositionHandlerEventArgs>)

/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragFinishing">Online Documentation</a>
 */
fun addDragFinishingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragFinishingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragFinished">Online Documentation</a>
 */
fun addDragFinishedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragFinishedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragStarting">Online Documentation</a>
 */
fun addDragStartingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragStartingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragStarted">Online Documentation</a>
 */
fun addDragStartedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragStartedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23Dragging">Online Documentation</a>
 */
fun addDraggingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23Dragged">Online Documentation</a>
 */
fun addDraggedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragCanceled">Online Documentation</a>
 */
fun addDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragCanceling">Online Documentation</a>
 */
fun addDragCancelingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCancelingListener(listener: EventHandler1<InputModeEventArgs>)

companion object : ClassMetadata<MoveInputMode> {
}
}

inline fun MoveInputMode(
    block: MoveInputMode.() -> Unit
): MoveInputMode {
    return MoveInputMode()
        .apply(block)
}

/**
 * Occurs when a drag is recognized for the [MoveInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23QueryPositionHandler">Online Documentation</a>
 */
inline fun  MoveInputMode.addQueryPositionHandlerHandler(
    crossinline handler: (event:QueryPositionHandlerEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<QueryPositionHandlerEventArgs> = { _, event -> handler(event) }
    addQueryPositionHandlerListener(listener)
    return { removeQueryPositionHandlerListener(listener) }
}
/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragFinishing">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragFinishingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragFinishingListener(listener)
    return { removeDragFinishingListener(listener) }
}
/**
 * Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragFinished">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragFinishedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragFinishedListener(listener)
    return { removeDragFinishedListener(listener) }
}
/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragStarting">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragStartingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragStartingListener(listener)
    return { removeDragStartingListener(listener) }
}
/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragStarted">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragStartedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragStartedListener(listener)
    return { removeDragStartedListener(listener) }
}
/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23Dragging">Online Documentation</a>
 */
inline fun  MoveInputMode.addDraggingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggingListener(listener)
    return { removeDraggingListener(listener) }
}
/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23Dragged">Online Documentation</a>
 */
inline fun  MoveInputMode.addDraggedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggedListener(listener)
    return { removeDraggedListener(listener) }
}
/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragCanceled">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragCanceledHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCanceledListener(listener)
    return { removeDragCanceledListener(listener) }
}
/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23DragCanceling">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragCancelingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCancelingListener(listener)
    return { removeDragCancelingListener(listener) }
}
