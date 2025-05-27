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
 * An [IInputMode] implementation that can be used to pan or zoom the viewport of a [CanvasComponent][yfiles.view.CanvasComponent] via mouse, stylus, and multitouch gestures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the move viewport mode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-constructor-MoveViewportInputMode">Online Documentation</a>
 */
open external class MoveViewportInputMode () : IInputMode, IEventDispatcher {
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
   * Gets or sets the event recognizer that determines whether to start the 'pinch' gesture with [TOUCH][yfiles.view.PointerType] input.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23beginPinchZoomRecognizer">Online Documentation</a>
   */
  final var beginPinchZoomRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to start moving the viewport.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23beginRecognizer">Online Documentation</a>
   */
  final var beginRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to start the 'move viewport' gesture with [TOUCH][yfiles.view.PointerType] input.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23beginRecognizerTouch">Online Documentation</a>
   */
  final var beginRecognizerTouch: EventRecognizer
  
  /**
   * Gets the installed [controller][MoveViewportInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the cursor to use during dragging.
   * 
   * The default is [POINTER][Cursor].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23dragCursor">Online Documentation</a>
   */
  final var dragCursor: Cursor?
  
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
   * Gets or sets the event recognizer that determines whether to finish the pinch zoom gesture or finish the move if no primary device is down.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23finishPinchZoomRecognizer">Online Documentation</a>
   */
  final var finishPinchZoomRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish moving the viewport.
   * 
   * The default instance detects [UP][yfiles.view.PointerEventType] events with the [MOUSE_LEFT][yfiles.view.PointerButtons] button, [MOUSE_MIDDLE][yfiles.view.PointerButtons] button, [CANCEL][yfiles.view.PointerEventType], or [DRAG_CAPTURE_LOST][yfiles.view.PointerEventType] events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType] input.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23finishRecognizer">Online Documentation</a>
   */
  final var finishRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish the 'move viewport' or 'pinch' gesture with [TOUCH][yfiles.view.PointerType] input.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23finishRecognizerTouch">Online Documentation</a>
   */
  final var finishRecognizerTouch: EventRecognizer
  
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
   * Gets or sets the event recognizer that determines whether to move the viewport.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23moveRecognizer">Online Documentation</a>
   */
  final var moveRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to move the viewport or zoom the canvas with [TOUCH][yfiles.view.PointerType] input.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23moveRecognizerTouch">Online Documentation</a>
   */
  final var moveRecognizerTouch: EventRecognizer
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * Gets or sets the distance threshold for returning from pinch zoom to two-finger panning with locked zoom level.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23pinchLockZoomThreshold">Online Documentation</a>
   */
  final var pinchLockZoomThreshold: Int
  
  /**
   * Gets or sets the event recognizer that determines whether to zoom the canvas using the 'pinch' gesture or move the viewport if no primary device is down.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23pinchZoomRecognizer">Online Documentation</a>
   */
  final var pinchZoomRecognizer: EventRecognizer
  
  /**
   * Gets or sets a value that determines how far the two pointers have to move apart while panning with two fingers in order to start a zoom gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23pinchZoomThreshold">Online Documentation</a>
   */
  final var pinchZoomThreshold: Int
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
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
   * Gets or sets the cursor to use when beginning to move the viewport is [valid][MoveViewportInputMode].
   * 
   * The default is `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23validBeginCursor">Online Documentation</a>
   */
  final var validBeginCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines whether it is valid to begin moving the viewport.
   * 
   * The default recognizer is [ALWAYS][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23validBeginRecognizer">Online Documentation</a>
   */
  final var validBeginRecognizer: EventRecognizer
  
  /**
   * Called to prepare moving the viewport when the mouse is pressed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-arm">Online Documentation</a>
   */
  protected open fun arm()
  
  /**
   * Cancels navigation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Called after moving the viewport is finished or canceled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-disarm">Online Documentation</a>
   */
  protected open fun disarm()
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][MoveViewportInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][MoveViewportInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Triggers the [drag-canceled][MoveViewportInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragCanceled">Online Documentation</a>
   */
  protected open fun onDragCanceled(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-canceling][MoveViewportInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragCanceling">Online Documentation</a>
   */
  protected open fun onDragCanceling(
    event: InputModeEventArgs,
  )
  
  /**
   * Called once the drag has been finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragFinished">Online Documentation</a>
   */
  protected open fun onDragFinished(
    event: InputModeEventArgs,
  )
  
  /**
   * Called before the drag will be finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragFinishing">Online Documentation</a>
   */
  protected open fun onDragFinishing(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-started][MoveViewportInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragStarted">Online Documentation</a>
   */
  protected open fun onDragStarted(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-starting][MoveViewportInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragStarting">Online Documentation</a>
   */
  protected open fun onDragStarting(
    event: InputModeEventArgs,
  )
  
  /**
   * Called at the end of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragged">Online Documentation</a>
   */
  protected open fun onDragged(
    event: InputModeEventArgs,
  )
  
  /**
   * Called at the start of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onDragging">Online Documentation</a>
   */
  protected open fun onDragging(
    event: InputModeEventArgs,
  )
  
  /**
   * Called after [tryStop][MoveViewportInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be uninstalled from.
   * @see [IInputMode.install]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23MoveViewportInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
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
 * `dragging`: Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23dragging">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDraggingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragging", listener)
  return { removeEventListener("dragging", listener) }
}

/**
 * `dragged`: Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23dragged">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDraggedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragged", listener)
  return { removeEventListener("dragged", listener) }
}

/**
 * `drag-finishing`: Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23drag-finishing">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragFinishingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-finishing", listener)
  return { removeEventListener("drag-finishing", listener) }
}

/**
 * `drag-finished`: Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23drag-finished">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragFinishedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-finished", listener)
  return { removeEventListener("drag-finished", listener) }
}

/**
 * `drag-starting`: Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23drag-starting">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragStartingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-starting", listener)
  return { removeEventListener("drag-starting", listener) }
}

/**
 * `drag-started`: Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23drag-started">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragStartedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-started", listener)
  return { removeEventListener("drag-started", listener) }
}

/**
 * `drag-canceled`: Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23drag-canceled">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragCanceledHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceled", listener)
  return { removeEventListener("drag-canceled", listener) }
}

/**
 * `drag-canceling`: Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveViewportInputMode%23drag-canceling">Online Documentation</a>
 */
inline fun  MoveViewportInputMode.addDragCancelingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceling", listener)
  return { removeEventListener("drag-canceling", listener) }
}
