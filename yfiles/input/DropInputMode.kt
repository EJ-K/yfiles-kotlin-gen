// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.view.DragDropData
import yfiles.view.DragDropEffects
import yfiles.view.DragEventArgs

/**
 * An input mode which handles drag and drop related events on a [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [DropInputMode] class for the given data type.
 * @param [transferType] A list of types that are used in [getData][yfiles.view.DragDropItem].
 * @see [drag-entered]
 * @see [drag-dropped]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-constructor-DropInputMode">Online Documentation</a>
 */
open external class DropInputMode (
  vararg transferType: String,
) : IInputMode, IEventDispatcher {
  /**
   * Gets or sets a value indicating whether to capture pointer input during drag operations.
   * 
   * The default is `true` and thus prevents pointer events from being processed by visuals in the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23capturePointerInputDuringDrag">Online Documentation</a>
   */
  final var capturePointerInputDuringDrag: Boolean
  
  /**
   * Gets the installed [controller][DropInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the [DragDropEffects] that will be used for drags on the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23dragDropEffect">Online Documentation</a>
   */
  final var dragDropEffect: DragDropEffects
  
  /**
   * Gets the data carried by a drag operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23dropData">Online Documentation</a>
   */
  open val dropData: DragDropData?
  
  /**
   * Gets the pointer position after dropping an item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23dropLocation">Online Documentation</a>
   */
  final val dropLocation: Point
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Gets a value indicating whether a drag operation is currently in progress.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23isDragging">Online Documentation</a>
   */
  final val isDragging: Boolean
  
  /**
   * Gets the last processed drag event argument.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23lastDragEventArgs">Online Documentation</a>
   */
  final val lastDragEventArgs: DragEventArgs?
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * Gets the current pointer position during drag operations.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23pointerPosition">Online Documentation</a>
   */
  final val pointerPosition: IPoint
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets the [IHitTestable] that determines whether the given location is a valid drop location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23validDropHitTestable">Online Documentation</a>
   */
  final var validDropHitTestable: IHitTestable
  
  /**
   * Called to adjust the [dropEffect][DragEventArgs] accordingly.
   * @param [event] The event args of the drag event to adjust the effects for.
   * @return `true` if the drag event is handled by this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-adjustEffect">Online Documentation</a>
   */
  protected open fun adjustEffect(
    event: DragEventArgs,
  ): Boolean
  
  /**
   * Cleanly cancels this mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Creates an implementation of [IInputModeContext] that is specific to this mode.
   * @return A readily configured [IInputModeContext].
   * @see [IHitTester.enumerateHits]
   * @see [IHitTestable.isHit]
   * @see [IInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
   * @return An input mode event argument that is configured for this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-createInputModeEventArgs">Online Documentation</a>
   */
  protected open fun createInputModeEventArgs(): InputModeEventArgs
  
  /**
   * Installs this mode into the given canvas.
   * @param [context] the context to install this mode into
   * @param [controller] The [controller][DropInputMode] for this mode.
   * @see [CanvasComponent][yfiles.view.CanvasComponent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Called after [cancel][DropInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Called once a drag has been dropped on the canvas.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onDragDropped">Online Documentation</a>
   */
  protected open fun onDragDropped(
    event: InputModeEventArgs,
  )
  
  /**
   * Called once a drag has entered the canvas.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onDragEntered">Online Documentation</a>
   */
  protected open fun onDragEntered(
    event: InputModeEventArgs,
  )
  
  /**
   * Called once a drag has left the canvas.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onDragLeft">Online Documentation</a>
   */
  protected open fun onDragLeft(
    event: InputModeEventArgs,
  )
  
  /**
   * Called whenever a drag is over the canvas.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onDraggedOver">Online Documentation</a>
   */
  protected open fun onDraggedOver(
    event: InputModeEventArgs,
  )
  
  /**
   * Called after [tryStop][DropInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * This method updates the [pointerPosition][DropInputMode] according to the coordinates passed in.
   * @param [location] The current location of the pointer in world coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-setDragLocation">Online Documentation</a>
   */
  protected open fun setDragLocation(
    location: Point,
  )
  
  /**
   * Overridden to only return `true` if this instance does not currently [have the input mutex][ConcurrencyController].
   * @return `true` iff this instance does not [own the mutex][ConcurrencyController].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the canvas.
   * @param [context] the context
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<DropInputMode> {
  }
}

/**
 * `drag-entered`: Occurs when a drag operation enters the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23drag-entered">Online Documentation</a>
 */
inline fun  DropInputMode.addDragEnteredHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-entered", listener)
  return { removeEventListener("drag-entered", listener) }
}

/**
 * `drag-over`: Occurs when a drag operation drags over the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23drag-over">Online Documentation</a>
 */
inline fun  DropInputMode.addDragOverHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-over", listener)
  return { removeEventListener("drag-over", listener) }
}

/**
 * `drag-left`: Occurs when a drag operation leaves the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23drag-left">Online Documentation</a>
 */
inline fun  DropInputMode.addDragLeftHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-left", listener)
  return { removeEventListener("drag-left", listener) }
}

/**
 * `drag-dropped`: Occurs when a drag operation is dropped onto the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23drag-dropped">Online Documentation</a>
 */
inline fun  DropInputMode.addDragDroppedHandler(
  crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeEventArgs> = { event, _ -> handler(event.context) }
  addEventListener("drag-dropped", listener)
  return { removeEventListener("drag-dropped", listener) }
}
