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
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor
import yfiles.view.IObjectRenderer

/**
 * An [IInputMode] implementation that provides support for marquee selections through mouse or touch gestures.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance of the marquee selection mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-constructor-MarqueeSelectionInputMode">Online Documentation</a>
 */
open external class MarqueeSelectionInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets or sets the event recognizer that determines whether to start creating the marquee.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23beginRecognizer">Online Documentation</a>
   */
  final var beginRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to start creating the marquee via touch.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DOWN][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23beginRecognizerTouch">Online Documentation</a>
   */
  final var beginRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to cancel the marquee selection.
   * 
   * The default recognizer detects [CANCEL][yfiles.view.PointerEventType] and [DRAG_CAPTURE_LOST][yfiles.view.PointerEventType] events for [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType] input or [ESCAPE_DOWN][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23cancelRecognizer">Online Documentation</a>
   */
  final var cancelRecognizer: EventRecognizer
  
  /**
   * Gets the installed [controller][MarqueeSelectionInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Gets or sets the cursor to use during the dragging of the marquee when [extendSelectionRecognizer][MarqueeSelectionInputMode] is active.
   * 
   * The default is `null` meaning that [marqueeCursor][MarqueeSelectionInputMode] will be used instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23extendSelectionCursor">Online Documentation</a>
   */
  final var extendSelectionCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines if a selection is deemed an additive selection gesture, adding to the current selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23extendSelectionRecognizer">Online Documentation</a>
   */
  final var extendSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish creating the marquee.
   * 
   * The default recognizer detects [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType] [UP][yfiles.view.PointerEventType] events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23finishRecognizer">Online Documentation</a>
   */
  final var finishRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish creating the marquee via touch.
   * 
   * The default recognizer is [TOUCH_PRIMARY_UP][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23finishRecognizerTouch">Online Documentation</a>
   */
  final var finishRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the cursor to use during the dragging of the marquee.
   * 
   * The default is `Cursors.Cross`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23marqueeCursor">Online Documentation</a>
   */
  final var marqueeCursor: Cursor?
  
  /**
   * Gets or sets the [IObjectRenderer] that visualizes the marquee selection rectangle.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23marqueeRenderer">Online Documentation</a>
   */
  final var marqueeRenderer: IObjectRenderer<MarqueeRenderTag>
  
  /**
   * Gets or sets the event recognizer that determines whether to adjust the size of the marquee.
   * 
   * The default recognizer detects [MOUSE][yfiles.view.PointerType] or [PEN][yfiles.view.PointerType] left [DRAG][yfiles.view.PointerEventType] events.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23moveRecognizer">Online Documentation</a>
   */
  final var moveRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to adjust the marquee size via touch.
   * 
   * The default recognizer is [TOUCH_PRIMARY_DRAG][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23moveRecognizerTouch">Online Documentation</a>
   */
  final var moveRecognizerTouch: EventRecognizer
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets the current or last marquee selection in world coordinates as a path.
   * @see [selectionRectangle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23selectionPath">Online Documentation</a>
   */
  final val selectionPath: GeneralPath
  
  /**
   * Gets the current or last [SelectionPolicy] as determined by the [EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23selectionPolicy">Online Documentation</a>
   */
  final val selectionPolicy: SelectionPolicy
  
  /**
   * Gets the current or last marquee selection rectangle.
   * @see [selectionPath]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23selectionRectangle">Online Documentation</a>
   */
  final val selectionRectangle: Rect
  
  /**
   * Gets or sets the cursor to use during the dragging of the marquee when [subtractSelectionRecognizer][MarqueeSelectionInputMode] is active.
   * 
   * The default is `null` meaning that [marqueeCursor][MarqueeSelectionInputMode] will be used instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23subtractSelectionCursor">Online Documentation</a>
   */
  final var subtractSelectionCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines if a selection is deemed a subtractive selection gesture, removing the selection state from the current selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23subtractSelectionRecognizer">Online Documentation</a>
   */
  final var subtractSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets the cursor to use during the dragging of the marquee when [toggleSelectionRecognizer][MarqueeSelectionInputMode] is active.
   * 
   * The default is `null` meaning that [marqueeCursor][MarqueeSelectionInputMode] will be used instead.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23toggleSelectionCursor">Online Documentation</a>
   */
  final var toggleSelectionCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines if a selection is deemed a toggle selection gesture, inverting the selection for the elements in the marquee.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23toggleSelectionRecognizer">Online Documentation</a>
   */
  final var toggleSelectionRecognizer: EventRecognizer
  
  /**
   * Gets or sets a value indicating whether the marquee rectangle is drawn in view coordinates (which include [projection][yfiles.view.CanvasComponent]), or intermediate coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23useViewCoordinates">Online Documentation</a>
   */
  final var useViewCoordinates: Boolean
  
  /**
   * Gets or sets the cursor to use when it is [valid][MarqueeSelectionInputMode] to begin the marquee selection.
   * 
   * The default is `null`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23validBeginCursor">Online Documentation</a>
   */
  final var validBeginCursor: Cursor?
  
  /**
   * Gets or sets the event recognizer that determines whether it is valid to begin drawing the marquee.
   * 
   * The default recognizer is [ALWAYS][EventRecognizers].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23validBeginRecognizer">Online Documentation</a>
   */
  final var validBeginRecognizer: EventRecognizer
  
  /**
   * Calculates the location and size of the marquee rectangle.
   * 
   * The default implementation returns a rectangle that is exactly large enough to contain the two specified points.
   * @param [startDragLocation] the location in world coordinates where the drag has been started
   * @param [currentDragLocation] the current location of the drag in world coordinates
   * @return the marquee rectangle to be determined from the given locations
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-calculateMarqueeRectangle">Online Documentation</a>
   */
  protected open fun calculateMarqueeRectangle(
    startDragLocation: Point,
    currentDragLocation: Point,
  ): Rect
  
  /**
   * Cancels any pending marquee selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Helper method that yields a suitably configured [MarqueeSelectionEventArgs] for this input mode.
   * @return An input mode event argument that is configured for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-createInputModeEventArgs">Online Documentation</a>
   */
  protected open fun createInputModeEventArgs(): MarqueeSelectionEventArgs
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][MarqueeSelectionInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][MarqueeSelectionInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Triggers the [drag-canceled][MarqueeSelectionInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragCanceled">Online Documentation</a>
   */
  protected open fun onDragCanceled(
    event: MarqueeSelectionEventArgs,
  )
  
  /**
   * Triggers the [drag-canceling][MarqueeSelectionInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragCanceling">Online Documentation</a>
   */
  protected open fun onDragCanceling(
    event: MarqueeSelectionEventArgs,
  )
  
  /**
   * Called once the drag has been finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragFinished">Online Documentation</a>
   */
  protected open fun onDragFinished(
    event: MarqueeSelectionEventArgs,
  )
  
  /**
   * Called before the drag will be finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragFinishing">Online Documentation</a>
   */
  protected open fun onDragFinishing(
    event: MarqueeSelectionEventArgs,
  )
  
  /**
   * Triggers the [drag-started][MarqueeSelectionInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragStarted">Online Documentation</a>
   */
  protected open fun onDragStarted(
    event: MarqueeSelectionEventArgs,
  )
  
  /**
   * Triggers the [drag-starting][MarqueeSelectionInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragStarting">Online Documentation</a>
   */
  protected open fun onDragStarting(
    event: MarqueeSelectionEventArgs,
  )
  
  /**
   * Called at the end of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragged">Online Documentation</a>
   */
  protected open fun onDragged(
    event: MarqueeSelectionEventArgs,
  )
  
  /**
   * Called at the start of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onDragging">Online Documentation</a>
   */
  protected open fun onDragging(
    event: MarqueeSelectionEventArgs,
  )
  
  /**
   * Called after [tryStop][MarqueeSelectionInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23MarqueeSelectionInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<MarqueeSelectionInputMode> {
  }
}

inline fun MarqueeSelectionInputMode(
    block: MarqueeSelectionInputMode.() -> Unit
): MarqueeSelectionInputMode {
    return MarqueeSelectionInputMode()
        .apply(block)
}

/**
 * `dragging`: Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23dragging">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDraggingHandler(
  crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
  val listener: EventHandler1<MarqueeSelectionEventArgs> = { event, _ -> handler(event.rectangle) }
  addEventListener("dragging", listener)
  return { removeEventListener("dragging", listener) }
}

/**
 * `dragged`: Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23dragged">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDraggedHandler(
  crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
  val listener: EventHandler1<MarqueeSelectionEventArgs> = { event, _ -> handler(event.rectangle) }
  addEventListener("dragged", listener)
  return { removeEventListener("dragged", listener) }
}

/**
 * `drag-canceled`: Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23drag-canceled">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragCanceledHandler(
  crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
  val listener: EventHandler1<MarqueeSelectionEventArgs> = { event, _ -> handler(event.rectangle) }
  addEventListener("drag-canceled", listener)
  return { removeEventListener("drag-canceled", listener) }
}

/**
 * `drag-canceling`: Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23drag-canceling">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragCancelingHandler(
  crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
  val listener: EventHandler1<MarqueeSelectionEventArgs> = { event, _ -> handler(event.rectangle) }
  addEventListener("drag-canceling", listener)
  return { removeEventListener("drag-canceling", listener) }
}

/**
 * `drag-finishing`: Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23drag-finishing">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragFinishingHandler(
  crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
  val listener: EventHandler1<MarqueeSelectionEventArgs> = { event, _ -> handler(event.rectangle) }
  addEventListener("drag-finishing", listener)
  return { removeEventListener("drag-finishing", listener) }
}

/**
 * `drag-finished`: Occurs the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23drag-finished">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragFinishedHandler(
  crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
  val listener: EventHandler1<MarqueeSelectionEventArgs> = { event, _ -> handler(event.rectangle) }
  addEventListener("drag-finished", listener)
  return { removeEventListener("drag-finished", listener) }
}

/**
 * `drag-starting`: Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23drag-starting">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragStartingHandler(
  crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
  val listener: EventHandler1<MarqueeSelectionEventArgs> = { event, _ -> handler(event.rectangle) }
  addEventListener("drag-starting", listener)
  return { removeEventListener("drag-starting", listener) }
}

/**
 * `drag-started`: Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarqueeSelectionInputMode%23drag-started">Online Documentation</a>
 */
inline fun  MarqueeSelectionInputMode.addDragStartedHandler(
  crossinline handler: (rectangle:Rect) -> Unit
): () -> Unit {
  val listener: EventHandler1<MarqueeSelectionEventArgs> = { event, _ -> handler(event.rectangle) }
  addEventListener("drag-started", listener)
  return { removeEventListener("drag-started", listener) }
}
