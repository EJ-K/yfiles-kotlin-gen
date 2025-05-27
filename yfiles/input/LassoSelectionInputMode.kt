// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.GeneralPath
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor
import yfiles.view.IObjectRenderer

/**
 * An [IInputMode] implementation that provides support for lasso selections through mouse or touch gestures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the lasso selection mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-constructor-LassoSelectionInputMode">Online Documentation</a>
 */
open external class LassoSelectionInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets or sets the event recognizer that determines whether to start drawing the lasso.
   * 
   * The default recognizer detects primary down events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23beginRecognizer">Online Documentation</a>
   */
  final var beginRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to start drawing the lasso with [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_LONG_PRESS][EventRecognizers] which reacts to the user making touch contact with the main touch device. Using [TOUCH_PRIMARY_DOWN][EventRecognizers] allows for an intuitive alternative configuration.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23beginRecognizerTouch">Online Documentation</a>
   */
  final var beginRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to cancel lasso selection.
   * 
   * The default recognizer reacts to [CANCEL][yfiles.view.PointerEventType] and [DRAG_CAPTURE_LOST][yfiles.view.PointerEventType] events, or [ESCAPE_DOWN][EventRecognizers], or secondary up events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23cancelRecognizer">Online Documentation</a>
   */
  final var cancelRecognizer: EventRecognizer
  
  /**
   * Gets the installed [controller][LassoSelectionInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the event recognizer that determines whether to drag the lasso free hand.
   * 
   * The default recognizer detects primary [DRAG][yfiles.view.PointerEventType] events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragFreeHandRecognizer">Online Documentation</a>
   */
  final var dragFreeHandRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to drag the lasso free hand with [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragFreeHandRecognizerTouch">Online Documentation</a>
   */
  final var dragFreeHandRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to drag a straight-line segment for the lasso.
   * 
   * The default recognizer is [MOUSE_MOVE][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragSegmentRecognizer">Online Documentation</a>
   */
  final var dragSegmentRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to drag a straight-line segment for the lasso with [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [NEVER][EventRecognizers] which means that the straight-line segment will only be finished when switching back to free hand creation or when finishing the gesture.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragSegmentRecognizerTouch">Online Documentation</a>
   */
  final var dragSegmentRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets the event recognizer that determines whether to end a segment and switch from segment to freehand mode.
   * 
   * The default recognizer detects primary down events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType]. However, since [startSegmentRecognizer][LassoSelectionInputMode] is disabled, this has no effect in the default configuration.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23endSegmentRecognizer">Online Documentation</a>
   */
  final var endSegmentRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to end a segment and switch from segment to freehand mode for [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DOWN][EventRecognizers]. However, since [startSegmentRecognizerTouch][LassoSelectionInputMode] is disabled, this has no effect in the default configuration.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23endSegmentRecognizerTouch">Online Documentation</a>
   */
  final var endSegmentRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Gets or sets the cursor to use during the dragging of the lasso when [extendSelectionRecognizer][LassoSelectionInputMode] is active.
   * 
   * The default is `null` meaning that [lassoCursor][LassoSelectionInputMode] will be used instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23extendSelectionCursor">Online Documentation</a>
   */
  final var extendSelectionCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines if a selection is deemed an additive selection gesture, adding to the current selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23extendSelectionRecognizer">Online Documentation</a>
   */
  final var extendSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the radius in view coordinates around the [startLocation][LassoSelectionInputMode] where the lasso selection can be finished.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRadius">Online Documentation</a>
   */
  final var finishRadius: Double
  
  /**
   * Gets or sets the event recognizer that determines whether to finish the gesture anywhere independent of the [finishRadius][LassoSelectionInputMode].
   * @see [finishRegionRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRecognizer">Online Documentation</a>
   */
  final var finishRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish the touch gesture anywhere independent of the [finishRadius][LassoSelectionInputMode].
   * 
   * The default recognizer is [TOUCH_PRIMARY_UP][EventRecognizers].
   * @see [finishRegionRecognizerTouch]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRecognizerTouch">Online Documentation</a>
   */
  final var finishRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish the gesture when the pointer is within the [finishRadius][LassoSelectionInputMode] of the [startLocation][LassoSelectionInputMode].
   * @see [finishRecognizer]
   * @see [finishRadius]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRegionRecognizer">Online Documentation</a>
   */
  final var finishRegionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish the touch gesture when the pointer is within the [finishRadius][LassoSelectionInputMode] of the [startLocation][LassoSelectionInputMode].
   * @see [finishRecognizer]
   * @see [finishRadius]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRegionRecognizerTouch">Online Documentation</a>
   */
  final var finishRegionRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the [IObjectRenderer] that visualizes the region around the [startLocation][LassoSelectionInputMode] where the lasso may be finished.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23finishRegionRenderer">Online Documentation</a>
   */
  final var finishRegionRenderer: IObjectRenderer<LassoPathFinishRegionRenderTag>
  
  /**
   * Gets or sets the cursor to use during the dragging of the lasso.
   * 
   * The default is [CROSSHAIR][Cursor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23lassoCursor">Online Documentation</a>
   */
  final var lassoCursor: Cursor?
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets the current or last selection path.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23selectionPath">Online Documentation</a>
   */
  final val selectionPath: GeneralPath
  
  /**
   * Gets the current or last [SelectionPolicy] as determined by the [EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23selectionPolicy">Online Documentation</a>
   */
  final val selectionPolicy: SelectionPolicy
  
  /**
   * Gets the location where the [beginRecognizer][LassoSelectionInputMode] was triggered and the lasso selection started.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23startLocation">Online Documentation</a>
   */
  protected final val startLocation: Point
  
  /**
   * Gets or sets the event recognizer that determines whether to switch from freehand to segment mode.
   * 
   * The default recognizer is [NEVER][EventRecognizers], which locks this mode in freehand-only mode. However, this can be set differently to allow for a mixed freehand/segment mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23startSegmentRecognizer">Online Documentation</a>
   */
  final var startSegmentRecognizer: EventRecognizer
  
  /**
   * Gets or sets a recognizer determining when to switch from freehand to segment mode for [TOUCH][yfiles.view.PointerType] input.
   * 
   * The default recognizer is [NEVER][EventRecognizers], which locks this mode in freehand-only mode. However, this can be set differently to allow for a mixed freehand/segment mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23startSegmentRecognizerTouch">Online Documentation</a>
   */
  final var startSegmentRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the cursor to use during the dragging of the lasso when [subtractSelectionRecognizer][LassoSelectionInputMode] is active.
   * 
   * The default is `null` meaning that [lassoCursor][LassoSelectionInputMode] will be used instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23subtractSelectionCursor">Online Documentation</a>
   */
  final var subtractSelectionCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines if a selection is deemed a subtractive selection gesture, removing the selection state from the current selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23subtractSelectionRecognizer">Online Documentation</a>
   */
  final var subtractSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the cursor to use during the dragging of the lasso when [toggleSelectionRecognizer][LassoSelectionInputMode] is active.
   * 
   * The default is `null` meaning that [lassoCursor][LassoSelectionInputMode] will be used instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23toggleSelectionCursor">Online Documentation</a>
   */
  final var toggleSelectionCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines if a selection is deemed a toggle selection gesture, inverting the selection for the elements in the lasso.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23toggleSelectionRecognizer">Online Documentation</a>
   */
  final var toggleSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the cursor to use when beginning the dragging of the lasso is [valid][LassoSelectionInputMode].
   * 
   * The default is `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23validBeginCursor">Online Documentation</a>
   */
  final var validBeginCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines whether it is valid to begin drawing the lasso.
   * 
   * The default recognizer is [ALWAYS][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23validBeginRecognizer">Online Documentation</a>
   */
  final var validBeginRecognizer: EventRecognizer
  
  /**
   * Gets or sets the cursor to use when hovering over a valid end location.
   * 
   * The default is `Cursors.Pen`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23validEndCursor">Online Documentation</a>
   */
  final var validEndCursor: Cursor?
  
  /**
   * Cancels any pending lasso selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Helper method that yields a suitably configured [LassoSelectionEventArgs] for this input mode.
   * @return An input mode event argument that is configured for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-createInputModeEventArgs">Online Documentation</a>
   */
  protected open fun createInputModeEventArgs(): LassoSelectionEventArgs
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][LassoSelectionInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Used by the [finishRecognizer][LassoSelectionInputMode] and [finishRecognizerTouch][LassoSelectionInputMode] to check the current cursor position.
   * @param [location] The location in world coordinates that should be checked.
   * @return `true` if the `location` is a valid end location; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-isValidEndLocation">Online Documentation</a>
   */
  protected open fun isValidEndLocation(
    location: Point,
  ): Boolean
  
  /**
   * Called after [cancel][LassoSelectionInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Triggers the [drag-canceled][LassoSelectionInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragCanceled">Online Documentation</a>
   */
  protected open fun onDragCanceled(
    event: LassoSelectionEventArgs,
  )
  
  /**
   * Triggers the [drag-canceling][LassoSelectionInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragCanceling">Online Documentation</a>
   */
  protected open fun onDragCanceling(
    event: LassoSelectionEventArgs,
  )
  
  /**
   * Called once the drag has been finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragFinished">Online Documentation</a>
   */
  protected open fun onDragFinished(
    event: LassoSelectionEventArgs,
  )
  
  /**
   * Called before the drag will be finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragFinishing">Online Documentation</a>
   */
  protected open fun onDragFinishing(
    event: LassoSelectionEventArgs,
  )
  
  /**
   * Triggers the [drag-started][LassoSelectionInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragStarted">Online Documentation</a>
   */
  protected open fun onDragStarted(
    event: LassoSelectionEventArgs,
  )
  
  /**
   * Triggers the [drag-starting][LassoSelectionInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragStarting">Online Documentation</a>
   */
  protected open fun onDragStarting(
    event: LassoSelectionEventArgs,
  )
  
  /**
   * Called at the end of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragged">Online Documentation</a>
   */
  protected open fun onDragged(
    event: LassoSelectionEventArgs,
  )
  
  /**
   * Called at the start of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onDragging">Online Documentation</a>
   */
  protected open fun onDragging(
    event: LassoSelectionEventArgs,
  )
  
  /**
   * Called after [tryStop][LassoSelectionInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23LassoSelectionInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<LassoSelectionInputMode> {
  }
}

inline fun LassoSelectionInputMode(
    block: LassoSelectionInputMode.() -> Unit
): LassoSelectionInputMode {
    return LassoSelectionInputMode()
        .apply(block)
}

/**
 * `dragging`: Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragging">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDraggingHandler(
  crossinline handler: (path:GeneralPath) -> Unit
): () -> Unit {
  val listener: EventHandler1<LassoSelectionEventArgs> = { event, _ -> handler(event.path) }
  addEventListener("dragging", listener)
  return { removeEventListener("dragging", listener) }
}

/**
 * `dragged`: Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23dragged">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDraggedHandler(
  crossinline handler: (path:GeneralPath) -> Unit
): () -> Unit {
  val listener: EventHandler1<LassoSelectionEventArgs> = { event, _ -> handler(event.path) }
  addEventListener("dragged", listener)
  return { removeEventListener("dragged", listener) }
}

/**
 * `drag-canceled`: Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23drag-canceled">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragCanceledHandler(
  crossinline handler: (path:GeneralPath) -> Unit
): () -> Unit {
  val listener: EventHandler1<LassoSelectionEventArgs> = { event, _ -> handler(event.path) }
  addEventListener("drag-canceled", listener)
  return { removeEventListener("drag-canceled", listener) }
}

/**
 * `drag-canceling`: Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23drag-canceling">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragCancelingHandler(
  crossinline handler: (path:GeneralPath) -> Unit
): () -> Unit {
  val listener: EventHandler1<LassoSelectionEventArgs> = { event, _ -> handler(event.path) }
  addEventListener("drag-canceling", listener)
  return { removeEventListener("drag-canceling", listener) }
}

/**
 * `drag-finishing`: Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23drag-finishing">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragFinishingHandler(
  crossinline handler: (path:GeneralPath) -> Unit
): () -> Unit {
  val listener: EventHandler1<LassoSelectionEventArgs> = { event, _ -> handler(event.path) }
  addEventListener("drag-finishing", listener)
  return { removeEventListener("drag-finishing", listener) }
}

/**
 * `drag-finished`: Occurs when the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23drag-finished">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragFinishedHandler(
  crossinline handler: (path:GeneralPath) -> Unit
): () -> Unit {
  val listener: EventHandler1<LassoSelectionEventArgs> = { event, _ -> handler(event.path) }
  addEventListener("drag-finished", listener)
  return { removeEventListener("drag-finished", listener) }
}

/**
 * `drag-starting`: Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23drag-starting">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragStartingHandler(
  crossinline handler: (path:GeneralPath) -> Unit
): () -> Unit {
  val listener: EventHandler1<LassoSelectionEventArgs> = { event, _ -> handler(event.path) }
  addEventListener("drag-starting", listener)
  return { removeEventListener("drag-starting", listener) }
}

/**
 * `drag-started`: Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LassoSelectionInputMode%23drag-started">Online Documentation</a>
 */
inline fun  LassoSelectionInputMode.addDragStartedHandler(
  crossinline handler: (path:GeneralPath) -> Unit
): () -> Unit {
  val listener: EventHandler1<LassoSelectionEventArgs> = { event, _ -> handler(event.path) }
  addEventListener("drag-started", listener)
  return { removeEventListener("drag-started", listener) }
}
