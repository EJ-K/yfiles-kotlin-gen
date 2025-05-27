// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
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
open external class ResizeStripeInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets or sets the event recognizer that determines whether to start resizing the stripe.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23beginRecognizer">Online Documentation</a>
   */
  final var beginRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to start resizing the stripe via [TOUCH][yfiles.view.PointerType] input.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23beginRecognizerTouch">Online Documentation</a>
   */
  final var beginRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to cancel the resize operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23cancelRecognizer">Online Documentation</a>
   */
  final var cancelRecognizer: EventRecognizer
  
  /**
   * Gets or sets the cursor to use when a column cannot be resized to current mouse position.
   * 
   * The default value is [NOT_ALLOWED][Cursor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23columnInvalidEndCursor">Online Documentation</a>
   */
  final var columnInvalidEndCursor: Cursor?
  
  /**
   * Gets or sets the cursor to use while resizing columns.
   * 
   * The default value is [COL_RESIZE][Cursor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23columnResizeCursor">Online Documentation</a>
   */
  final var columnResizeCursor: Cursor?
  
  /**
   * Gets or sets the cursor to use while hovering over the border of a column that may be resized.
   * 
   * The default value is [COL_RESIZE][Cursor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23columnValidBeginCursor">Online Documentation</a>
   */
  final var columnValidBeginCursor: Cursor?
  
  /**
   * Gets the installed [controller][ResizeStripeInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
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
   * Gets or sets the event recognizer that determines whether to finish resizing the stripe.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23finishRecognizer">Online Documentation</a>
   */
  final var finishRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to finish resizing the stripe via [TOUCH][yfiles.view.PointerType] input.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23finishRecognizerTouch">Online Documentation</a>
   */
  final var finishRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to ignore the content of all stripes instead of moving them or considering for minimum sizes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ignoreContentRecognizer">Online Documentation</a>
   */
  final var ignoreContentRecognizer: EventRecognizer
  
  /**
   * Gets a value indicating whether a drag operation is currently in progress.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23isDragging">Online Documentation</a>
   */
  final val isDragging: Boolean
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets the event recognizer that determines whether to resize adjacent stripes instead of moving them.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23resizeNeighborsRecognizer">Online Documentation</a>
   */
  final var resizeNeighborsRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to change the stripe size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23resizeRecognizer">Online Documentation</a>
   */
  final var resizeRecognizer: EventRecognizer
  
  /**
   * Gets or sets the event recognizer that determines whether to change the stripe size via [TOUCH][yfiles.view.PointerType] input.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23resizeRecognizerTouch">Online Documentation</a>
   */
  final var resizeRecognizerTouch: EventRecognizer
  
  /**
   * Gets or sets the cursor to use when a row cannot be resized to current mouse position.
   * 
   * The default value is [NOT_ALLOWED][Cursor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23rowInvalidEndCursor">Online Documentation</a>
   */
  final var rowInvalidEndCursor: Cursor?
  
  /**
   * Gets or sets the cursor to use while resizing rows.
   * 
   * The default value is [ROW_RESIZE][Cursor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23rowResizeCursor">Online Documentation</a>
   */
  final var rowResizeCursor: Cursor?
  
  /**
   * Gets or sets the cursor to use while hovering over the border of a row that may be resized.
   * 
   * The default value is [ROW_RESIZE][Cursor]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23rowValidBeginCursor">Online Documentation</a>
   */
  final var rowValidBeginCursor: Cursor?
  
  /**
   * Cancels the editing of this mode.
   * @see [onCanceled]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Creates an implementation of [IInputModeContext] that is specific to this mode.
   * @return A readily configured [IInputModeContext].
   * @see [IHitTester.enumerateHits]
   * @see [IHitTestable.isHit]
   * @see [IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][ResizeStripeInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called to determine whether it is valid to begin the gesture.
   * @param [location] The event location to check.
   * @return true iff a stripe border has been hit at the latest [PointerEventArgs][yfiles.view.PointerEventArgs]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-isValidBeginLocation">Online Documentation</a>
   */
  protected open fun isValidBeginLocation(
    location: Point,
  ): Boolean
  
  /**
   * Called after [cancel][ResizeStripeInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Triggers the [drag-canceled][ResizeStripeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragCanceled">Online Documentation</a>
   */
  protected open fun onDragCanceled(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-canceling][ResizeStripeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragCanceling">Online Documentation</a>
   */
  protected open fun onDragCanceling(
    event: InputModeEventArgs,
  )
  
  /**
   * Called once the drag has been finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragFinished">Online Documentation</a>
   */
  protected open fun onDragFinished(
    event: InputModeEventArgs,
  )
  
  /**
   * Called before the drag will be finalized.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragFinishing">Online Documentation</a>
   */
  protected open fun onDragFinishing(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-started][ResizeStripeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragStarted">Online Documentation</a>
   */
  protected open fun onDragStarted(
    event: InputModeEventArgs,
  )
  
  /**
   * Triggers the [drag-starting][ResizeStripeInputMode] event.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragStarting">Online Documentation</a>
   */
  protected open fun onDragStarting(
    event: InputModeEventArgs,
  )
  
  /**
   * Called at the end of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragged">Online Documentation</a>
   */
  protected open fun onDragged(
    event: InputModeEventArgs,
  )
  
  /**
   * Called at the start of each drag.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onDragging">Online Documentation</a>
   */
  protected open fun onDragging(
    event: InputModeEventArgs,
  )
  
  /**
   * Called after [tryStop][ResizeStripeInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23ResizeStripeInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
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
 * `drag-finishing`: Occurs before the drag will be finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23drag-finishing">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragFinishingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-finishing", listener)
  return { removeEventListener("drag-finishing", listener) }
}

/**
 * `drag-finished`: Occurs once the drag has been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23drag-finished">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragFinishedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-finished", listener)
  return { removeEventListener("drag-finished", listener) }
}

/**
 * `drag-starting`: Occurs once the drag is starting.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23drag-starting">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragStartingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-starting", listener)
  return { removeEventListener("drag-starting", listener) }
}

/**
 * `drag-started`: Occurs once the drag is initialized and has started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23drag-started">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragStartedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-started", listener)
  return { removeEventListener("drag-started", listener) }
}

/**
 * `dragging`: Occurs at the start of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23dragging">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDraggingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragging", listener)
  return { removeEventListener("dragging", listener) }
}

/**
 * `dragged`: Occurs at the end of every drag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23dragged">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDraggedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("dragged", listener)
  return { removeEventListener("dragged", listener) }
}

/**
 * `drag-canceled`: Occurs when the drag has been canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23drag-canceled">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragCanceledHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceled", listener)
  return { removeEventListener("drag-canceled", listener) }
}

/**
 * `drag-canceling`: Occurs before the drag will be canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ResizeStripeInputMode%23drag-canceling">Online Documentation</a>
 */
inline fun  ResizeStripeInputMode.addDragCancelingHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-canceling", listener)
  return { removeEventListener("drag-canceling", listener) }
}
