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
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.TimeSpan
import yfiles.view.Cursor

/**
 * An [IInputMode] implementation that can be used to grab and move and to zoom the viewport of a [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the move viewport mode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-constructor-MoveViewportInputMode">Online Documentation</a>
 */
external open class MoveViewportInputMode  () : IInputMode, IEventDispatcher {

/**
 * Gets or sets a value indicating whether to allow the pinch zoom gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23allowPinchZoom">Online Documentation</a>
 */
final var allowPinchZoom: Boolean
/**
 * Gets or sets a value indicating whether moving the viewport can be started with a single pointer, i.e., touching with one finger.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23allowSinglePointerMovement">Online Documentation</a>
 */
final var allowSinglePointerMovement: Boolean
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the cursor to use during the dragging.
 * 
 * The default is [Cursor.POINTER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23dragCursor">Online Documentation</a>
 */
final var dragCursor: Cursor?
/**
 * Gets or sets the event recognizer that determines whether to drag the viewport.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23draggedRecognizer">Online Documentation</a>
 */
final var draggedRecognizer: EventRecognizer
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * Gets or sets the mode that determines when to use inertia when dragging the viewport.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23inertia">Online Documentation</a>
 */
final var inertia: InertiaPolicies
/**
 * Gets or sets the duration of the inertia movement.
 * 
 * The default value is `1.5` seconds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23inertiaDuration">Online Documentation</a>
 */
final var inertiaDuration: TimeSpan
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets or sets the distance threshold for returning from pinch zoom to two-finger panning with locked zoom level.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23pinchLockZoomThreshold">Online Documentation</a>
 */
final var pinchLockZoomThreshold: Int
/**
 * Gets or sets a value that determines how far the two pointers have to move apart while panning with two fingers in order to start a zoom gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23pinchZoomThreshold">Online Documentation</a>
 */
final var pinchZoomThreshold: Int
/**
 * Gets or sets the event recognizer that determines whether to start the navigation gesture.
 * 
 * By default this recognizer detects left mouse button presses.
 * If this input mode is a child mode of [GraphEditorInputMode] method [GraphEditorInputMode.createMoveViewportInputMode] sets a different recognizer which detects left clicks with Ctrl held down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23pressedRecognizer">Online Documentation</a>
 */
final var pressedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to start the 'move viewport' gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23primaryDownRecognizer">Online Documentation</a>
 */
final var primaryDownRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to move the viewport or zoom the canvas if a secondary device is down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23primaryMoveRecognizer">Online Documentation</a>
 */
final var primaryMoveRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to finish the 'move viewport' or 'pinch' gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23primaryUpRecognizer">Online Documentation</a>
 */
final var primaryUpRecognizer: EventRecognizer
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets the event recognizer that determines whether to finish dragging the viewport.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23releasedRecognizer">Online Documentation</a>
 */
final var releasedRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to start the 'pinch' gesture
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23secondaryDownRecognizer">Online Documentation</a>
 */
final var secondaryDownRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to zoom the canvas using the 'pinch' gesture or move the viewport if no primary device is down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23secondaryMoveRecognizer">Online Documentation</a>
 */
final var secondaryMoveRecognizer: EventRecognizer
/**
 * Gets or sets the event recognizer that determines whether to finish the pinch zoom gesture or finish the move if no primary device is down.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23secondaryUpRecognizer">Online Documentation</a>
 */
final var secondaryUpRecognizer: EventRecognizer
/**
 * Gets or sets a value indicating whether touch panning should snap to the x- or y-axis.
 * @see [snapPanningThreshold]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23snapPanning">Online Documentation</a>
 */
final var snapPanning: SnapPanningBehaviors
/**
 * Gets or sets a value that determines how far the pointer has to move away from the snapped axis in order to start with free panning.
 * @see [snapPanning]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23snapPanningThreshold">Online Documentation</a>
 */
final var snapPanningThreshold: Int
/**
 * Gets or sets the cursor to use when beginning to move the viewport is [valid][validBeginRecognizer].
 * 
 * The default is `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23validBeginCursor">Online Documentation</a>
 */
final var validBeginCursor: Cursor?
/**
 * Gets or sets the event recognizer that determines whether it is valid to begin moving the viewport.
 * 
 * The default value is [EventRecognizers.ALWAYS].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23validBeginRecognizer">Online Documentation</a>
 */
final var validBeginRecognizer: EventRecognizer
/**
 * Called to prepare moving the viewport when the mouse is pressed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-arm">Online Documentation</a>
 */
 open protected   fun arm()
/**
 * Cancels navigation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Called after moving the viewport is finished or canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-disarm">Online Documentation</a>
 */
 open protected   fun disarm()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Triggers the [DragCanceled] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragCanceled">Online Documentation</a>
 */
 open protected   fun onDragCanceled( event: InputModeEventArgs )
/**
 * Triggers the [DragCanceling] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragCanceling">Online Documentation</a>
 */
 open protected   fun onDragCanceling( event: InputModeEventArgs )
/**
 * Called once the drag has been finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragFinished">Online Documentation</a>
 */
 open protected   fun onDragFinished( event: InputModeEventArgs )
/**
 * Called before the drag will be finalized.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragFinishing">Online Documentation</a>
 */
 open protected   fun onDragFinishing( event: InputModeEventArgs )
/**
 * Triggers the [DragStarted] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragStarted">Online Documentation</a>
 */
 open protected   fun onDragStarted( event: InputModeEventArgs )
/**
 * Triggers the [DragStarting] event.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragStarting">Online Documentation</a>
 */
 open protected   fun onDragStarting( event: InputModeEventArgs )
/**
 * Called at the end of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragged">Online Documentation</a>
 */
 open protected   fun onDragged( event: InputModeEventArgs )
/**
 * Called at the start of each drag.
 * @param [event] The event argument that contains context information.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragging">Online Documentation</a>
 */
 open protected   fun onDragging( event: InputModeEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be uninstalled from.
 * @see [IInputMode.install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23Dragging">Online Documentation</a>
 */
fun addDraggingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23Dragged">Online Documentation</a>
 */
fun addDraggedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDraggedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragFinishing">Online Documentation</a>
 */
fun addDragFinishingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragFinishingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragFinished">Online Documentation</a>
 */
fun addDragFinishedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragFinishedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragStarting">Online Documentation</a>
 */
fun addDragStartingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragStartingListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragStarted">Online Documentation</a>
 */
fun addDragStartedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragStartedListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragCanceled">Online Documentation</a>
 */
fun addDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCanceledListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragCanceling">Online Documentation</a>
 */
fun addDragCancelingListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragCancelingListener(listener: EventHandler1<InputModeEventArgs>)

companion object : ClassMetadata<MoveViewportInputMode> {
}
}

inline fun MoveViewportInputMode(
    block: MoveViewportInputMode.() -> Unit
): MoveViewportInputMode {
    return MoveViewportInputMode()
        .apply(block)
}

/**
 * Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23Dragging">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDraggingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggingListener(listener)
    return { removeDraggingListener(listener) }
}
/**
 * Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23Dragged">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDraggedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDraggedListener(listener)
    return { removeDraggedListener(listener) }
}
/**
 * Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragFinishing">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragFinishingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragFinishingListener(listener)
    return { removeDragFinishingListener(listener) }
}
/**
 * Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragFinished">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragFinishedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragFinishedListener(listener)
    return { removeDragFinishedListener(listener) }
}
/**
 * Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragStarting">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragStartingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragStartingListener(listener)
    return { removeDragStartingListener(listener) }
}
/**
 * Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragStarted">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragStartedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragStartedListener(listener)
    return { removeDragStartedListener(listener) }
}
/**
 * Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragCanceled">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragCanceledHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCanceledListener(listener)
    return { removeDragCanceledListener(listener) }
}
/**
 * Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23DragCanceling">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragCancelingHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragCancelingListener(listener)
    return { removeDragCancelingListener(listener) }
}
