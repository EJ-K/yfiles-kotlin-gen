// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.array.ReadonlyArray
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
 * @constructor Initializes a new instance of the [DropInputMode] class for the expected data type.
 * @param [expectedType] The type that is used in [DragDropItem.getData][yfiles.view.DragDropItem.getData]. This may also be a string that contains a comma-separated list of types.
 * @see [addDragEnteredListener]
 * @see [addDragDroppedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-constructor-DropInputMode(string)">Online Documentation</a>
 */
external open class DropInputMode  ( expectedType: String ) : IInputMode, IEventDispatcher {
/**
 * Initializes a new instance of the [DropInputMode] class for the expected data type.
 * @param [expectedType] A list of types that are used in [DragDropItem.getData][yfiles.view.DragDropItem.getData].
 * @see [addDragEnteredListener]
 * @see [addDragDroppedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-constructor-DropInputMode(string[])">Online Documentation</a>
 */
 constructor( expectedType: ReadonlyArray<String> )

/**
 * Gets or sets a value indicating whether to capture mouse input during drag operations.
 * 
 * The default is `true` and thus prevents mouse events from being processed by visuals in the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23captureMouseInputDuringDrag">Online Documentation</a>
 */
final var captureMouseInputDuringDrag: Boolean
/**
 * Gets the installed [controller].
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
 * Gets the mouse position after dropping an item.
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
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
 * Gets the current mouse position during drag operations.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23mousePosition">Online Documentation</a>
 */
final val mousePosition: IPoint
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
 * Called to adjust the [DragEventArgs.dropEffect] accordingly.
 * @param [event] The event args of the drag event to adjust the effects for.
 * @return `true` if the drag event is handled by this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-adjustEffect">Online Documentation</a>
 */
 open protected   fun adjustEffect( event: DragEventArgs ):Boolean
/**
 * Cleanly cancels this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Helper method that yields a suitably configured [InputModeEventArgs] for this input mode.
 * @return An input mode event argument that is configured for this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-createInputModeEventArgs">Online Documentation</a>
 */
 open protected   fun createInputModeEventArgs():InputModeEventArgs
/**
 * Installs this mode into the given canvas.
 * @param [context] the context to install this mode into
 * @param [controller] The [controller] for this mode.
 * @see [CanvasComponent][yfiles.view.CanvasComponent]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Called once a drag has been dropped on the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onDragDropped">Online Documentation</a>
 */
 open protected   fun onDragDropped( event: InputModeEventArgs )
/**
 * Called once a drag has entered the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onDragEntered">Online Documentation</a>
 */
 open protected   fun onDragEntered( event: InputModeEventArgs )
/**
 * Called once a drag has left the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onDragLeft">Online Documentation</a>
 */
 open protected   fun onDragLeft( event: InputModeEventArgs )
/**
 * Called whenever a drag is over the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onDraggedOver">Online Documentation</a>
 */
 open protected   fun onDraggedOver( event: InputModeEventArgs )
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * This method updates the [mousePosition] according to the coordinates passed in.
 * @param [location] The current location of the mouse in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-setDragLocation">Online Documentation</a>
 */
 open protected   fun setDragLocation( location: Point )
/**
 * Overridden to only return `true` if this instance does not currently [have the input mutex][ConcurrencyController.hasMutex].
 * @return `true` iff this instance does not [own the mutex][ConcurrencyController.hasMutex].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the canvas.
 * @param [context] the context
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DropInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when a drag operation enters the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DragEntered">Online Documentation</a>
 */
fun addDragEnteredListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragEnteredListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when a drag operation drags over the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DragOver">Online Documentation</a>
 */
fun addDragOverListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragOverListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when a drag operation leaves the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DragLeft">Online Documentation</a>
 */
fun addDragLeftListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragLeftListener(listener: EventHandler1<InputModeEventArgs>)

/**
 * Occurs when a drag operation is dropped onto the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DragDropped">Online Documentation</a>
 */
fun addDragDroppedListener(listener: EventHandler1<InputModeEventArgs>)
fun removeDragDroppedListener(listener: EventHandler1<InputModeEventArgs>)

companion object : ClassMetadata<DropInputMode> {
}
}

/**
 * Occurs when a drag operation enters the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DragEntered">Online Documentation</a>
 */
inline fun  DropInputMode.addDragEnteredHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragEnteredListener(listener)
    return { removeDragEnteredListener(listener) }
}
/**
 * Occurs when a drag operation drags over the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DragOver">Online Documentation</a>
 */
inline fun  DropInputMode.addDragOverHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragOverListener(listener)
    return { removeDragOverListener(listener) }
}
/**
 * Occurs when a drag operation leaves the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DragLeft">Online Documentation</a>
 */
inline fun  DropInputMode.addDragLeftHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragLeftListener(listener)
    return { removeDragLeftListener(listener) }
}
/**
 * Occurs when a drag operation is dropped onto the [CanvasComponent][yfiles.view.CanvasComponent] into which this instance is installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DropInputMode%23DragDropped">Online Documentation</a>
 */
inline fun  DropInputMode.addDragDroppedHandler(
    crossinline handler: (context:IInputModeContext) -> Unit
): () -> Unit {
    val listener: EventHandler1<InputModeEventArgs> = { _, event -> handler(event.context) }
    addDragDroppedListener(listener)
    return { removeDragDroppedListener(listener) }
}
