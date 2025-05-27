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
open external class MoveInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets an immutable snapshot of the [IModelItem]s affected by the currently [active][MoveInputMode] gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23affectedItems">Online Documentation</a>
   */
  final val affectedItems: IEnumerable<IModelItem>
  
  /**
   * Gets or sets the event recognizer that determines whether to start moving the selection.
   * 
   * The default recognizer detects [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType] [DRAG][yfiles.view.PointerEventType] events with the [MOUSE_LEFT][yfiles.view.PointerButtons] button.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23beginRecognizer">Online Documentation</a>
   */
  final var beginRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to start moving the selection via [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DOWN][EventRecognizers] which reacts to the user making touch contact with the main touch device. Using [TOUCH_PRIMARY_LONG_PRESS][EventRecognizers] allows for an intuitive alternative configuration, specifically, when [panning the viewport][MoveViewportInputMode] is a more frequent use-case.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23beginRecognizerTouch">Online Documentation</a>
   */
  final var beginRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to cancel the move.
   * 
   * The default recognizer detects [ESCAPE_DOWN][EventRecognizers] or [CANCEL][yfiles.view.PointerEventType] and [DRAG_CAPTURE_LOST][yfiles.view.PointerEventType] events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23cancelRecognizer">Online Documentation</a>
   */
  final var cancelRecognizer: EventRecognizer
  
  /**
   * Gets the installed [controller][MoveInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the event recognizer that constrains the current movement to be orthogonal or diagonal.
   * 
   * The default recognizer is [SHIFT_IS_DOWN][EventRecognizers]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23directionalConstraintRecognizer">Online Documentation</a>
   */
  final var directionalConstraintRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to temporarily disable snapping.
   * 
   * The default recognizer is [ALT_DOWN][EventRecognizers].
   * @see [enableSnappingRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23disableSnappingRecognizer">Online Documentation</a>
   */
  final var disableSnappingRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to re-enable temporarily disabled snapping.
   * 
   * The default recognizer is [ALT_UP][EventRecognizers].
   * @see [disableSnappingRecognizer]
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
   * Gets or sets the event recognizer that determines whether to finish moving the selection.
   * 
   * The default recognizer detects left-up events of mouse and stylus devices.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23finishRecognizer">Online Documentation</a>
   */
  final var finishRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish moving the selection via [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_UP][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23finishRecognizerTouch">Online Documentation</a>
   */
  final var finishRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the [IHitTestable] that will be used by this mode to determine where the user may start dragging.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23hitTestable">Online Documentation</a>
   */
  final var hitTestable: IHitTestable
  
  /**
   * Gets or sets the event recognizer that determines whether the user is hovering over an item where the user can begin a move operation.
   * 
   * The default implementation uses the [hitTestable][MoveInputMode] to determine whether the move operation can be started at the current location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23hoverRecognizer">Online Documentation</a>
   */
  final var hoverRecognizer: EventRecognizer
  
  /**
   * Gets the initial position where the dragging was initiated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23initialLocation">Online Documentation</a>
   */
  final val initialLocation: Point
  
  /**
   * Gets a value indicating whether a drag operation is currently in progress.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23isDragging">Online Documentation</a>
   */
  final val isDragging: Boolean
  
  /**
   * Gets or sets the cursor to use while moving items.
   * 
   * The default cursor is [MOVE][Cursor].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23moveCursor">Online Documentation</a>
   */
  final var moveCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines whether to move the selection.
   * 
   * The default recognizer is [MOUSE_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23moveRecognizer">Online Documentation</a>
   */
  final var moveRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to move the selection via [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23moveRecognizerTouch">Online Documentation</a>
   */
  final var moveRecognizerTouch: EventRecognizer
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * Gets or sets the [IPositionHandler] that will be used as fallback to handle the actual movement of the elements during the drag.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23positionHandler">Online Documentation</a>
   */
  final var positionHandler: IPositionHandler?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets the [GraphSnapContext] which manages snapping model items to certain coordinates (for instance, other items).
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23snapContext">Online Documentation</a>
   */
  final var snapContext: GraphSnapContext?
  
  /**
   * Gets or sets the cursor to use while hovering above items that may be moved.
   * 
   * The default cursor is [MOVE][Cursor].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23validBeginCursor">Online Documentation</a>
   */
  final var validBeginCursor: Cursor?
  
  /**
   * Called when this mode is "armed".
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-arm">Online Documentation</a>
   */
  protected open fun arm()
  
  /**
   * Cancels the editing of this mode.
   * @see [onCanceled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Returns the input mode context that will be passed to implementations that are called by this instance and require a context.
   * @return A context to use for the implementations that are called by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Creates an [IInputModeContext] for use with the [IPositionHandler] interface for the upcoming drag operation.
   * @return An instance of [IInputModeContext].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-createPositionHandlerInputModeContext">Online Documentation</a>
   */
  protected open fun createPositionHandlerInputModeContext(): IInputModeContext
  
  /**
   * Called when this mode is "disarmed".
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-disarm">Online Documentation</a>
   */
  protected open fun disarm()
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][MoveInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][MoveInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Triggers the [drag-canceled][MoveInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragCanceled">Online Documentation</a>
   */
  protected open fun onDragCanceled(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-canceling][MoveInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragCanceling">Online Documentation</a>
   */
  protected open fun onDragCanceling(
    event: InputModeEventArgs,
  )
  
  /**
   * Called once the drag has been finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragFinished">Online Documentation</a>
   */
  protected open fun onDragFinished(
    event: InputModeEventArgs,
  )
  
  /**
   * Called before the drag will be finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragFinishing">Online Documentation</a>
   */
  protected open fun onDragFinishing(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-started][MoveInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragStarted">Online Documentation</a>
   */
  protected open fun onDragStarted(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-starting][MoveInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragStarting">Online Documentation</a>
   */
  protected open fun onDragStarting(
    event: InputModeEventArgs,
  )
  
  /**
   * Called at the end of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragged">Online Documentation</a>
   */
  protected open fun onDragged(
    event: InputModeEventArgs,
  )
  
  /**
   * Called at the start of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onDragging">Online Documentation</a>
   */
  protected open fun onDragging(
    event: InputModeEventArgs,
  )
  
  /**
   * Raises the [query-position-handler][MoveInputMode] event.
   * @param [event] The [QueryPositionHandlerEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onQueryPositionHandler">Online Documentation</a>
   */
  protected open fun onQueryPositionHandler(
    event: QueryPositionHandlerEventArgs,
  )
  
  /**
   * Called after [tryStop][MoveInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Simulates the start of a drag and puts the state machine into the dragging state.
   * @param [location] The location where the drag had been initialized.
   * @return A task that represents the asynchronous drag operation. The result of the task contains the affected items or `null` if the drag was canceled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-startDrag">Online Documentation</a>
   */
  open fun startDrag(
    location: Point,
  ): Promise<IEnumerable<IModelItem>?>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23MoveInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
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
 * `query-position-handler`: Occurs when a drag is recognized for the [MoveInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23query-position-handler">Online Documentation</a>
 */
inline fun  MoveInputMode.addQueryPositionHandlerHandler(
  crossinline handler: (event:QueryPositionHandlerEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<QueryPositionHandlerEventArgs> = { event, _ -> handler(event) }
  addEventListener("query-position-handler", listener)
  return { removeEventListener("query-position-handler", listener) }
}

/**
 * `drag-finishing`: Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23drag-finishing">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragFinishingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-finishing", listener)
  return { removeEventListener("drag-finishing", listener) }
}

/**
 * `drag-finished`: Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23drag-finished">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragFinishedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-finished", listener)
  return { removeEventListener("drag-finished", listener) }
}

/**
 * `drag-starting`: Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23drag-starting">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragStartingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-starting", listener)
  return { removeEventListener("drag-starting", listener) }
}

/**
 * `drag-started`: Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23drag-started">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragStartedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-started", listener)
  return { removeEventListener("drag-started", listener) }
}

/**
 * `dragging`: Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23dragging">Online Documentation</a>
 */
inline fun  MoveInputMode.addDraggingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragging", listener)
  return { removeEventListener("dragging", listener) }
}

/**
 * `dragged`: Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23dragged">Online Documentation</a>
 */
inline fun  MoveInputMode.addDraggedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragged", listener)
  return { removeEventListener("dragged", listener) }
}

/**
 * `drag-canceled`: Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23drag-canceled">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragCanceledHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceled", listener)
  return { removeEventListener("drag-canceled", listener) }
}

/**
 * `drag-canceling`: Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MoveInputMode%23drag-canceling">Online Documentation</a>
 */
inline fun  MoveInputMode.addDragCancelingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceling", listener)
  return { removeEventListener("drag-canceling", listener) }
}
