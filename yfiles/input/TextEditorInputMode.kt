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
import web.html.HTMLDivElement
import yfiles.geometry.IPoint
import yfiles.geometry.Insets
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher

/**
 * An [IInputMode] implementation that displays a `textarea` in the [CanvasComponent][yfiles.view.CanvasComponent] to let the user edit a text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance using a default text box or the provided editor.
 * @param [editorContainer] The editor to use as the text editor. If none is provided a default text editor will be used.
 * @see [createEditorContainer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-constructor-TextEditorInputMode">Online Documentation</a>
 */
external open class TextEditorInputMode  ( editorContainer: HTMLDivElement?  = definedExternally) : IInputMode, IEventDispatcher {

/**
 * Gets or sets the anchor of the text box.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23anchor">Online Documentation</a>
 */
final var anchor: IPoint
/**
 * Gets or sets a property that determines whether the text edited should be committed if the focus gets lost or the editing should be canceled.
 * 
 * The default behavior is to cancel the editing process.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23autoCommitOnFocusLost">Online Documentation</a>
 */
final var autoCommitOnFocusLost: Boolean
/**
 * Gets or sets a value indicating whether to automatically flip the orientation of the text box if the [upVector] actually points downwards.
 * 
 * The default is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23autoFlipTextBox">Online Documentation</a>
 */
final var autoFlipTextBox: Boolean
/**
 * Gets or sets a property that determines whether this mode should try to [CanvasComponent.focus][yfiles.view.CanvasComponent.focus] the [GraphComponent][yfiles.view.GraphComponent] once the editor is closed via a keyboard gesture.
 * 
 * The default is `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23autoFocusCanvasOnEditorClosed">Online Documentation</a>
 */
final var autoFocusCanvasOnEditorClosed: Boolean
/**
 * Gets or sets whether this mode should automatically fire up the editor once it gets installed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23autoStartEditing">Online Documentation</a>
 */
final var autoStartEditing: Boolean
/**
 * Gets or sets the event recognizer to detect when editing the text shall be canceled.
 * @see [lineBreakRecognizer]
 * @see [stopRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23cancelRecognizer">Online Documentation</a>
 */
final var cancelRecognizer: EventRecognizer
/**
 * Gets the installed [controller].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23controller">Online Documentation</a>
 */
protected final val controller: ConcurrencyController?
/**
 * Gets or sets the current editing state of the editor.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23editing">Online Documentation</a>
 */
final var editing: Boolean
/**
 * Gets the `div`-element that contains the text editor.
 * @see [createEditorContainer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23editorContainer">Online Documentation</a>
 */
final val editorContainer: HTMLDivElement
/**
 * Gets or sets the text that is displayed and edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23editorText">Online Documentation</a>
 */
open var editorText: String
/**
 * Gets or sets the enabled state of this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23enabled">Online Documentation</a>
 */
open var enabled: Boolean
/**
 * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23exclusive">Online Documentation</a>
 */
final var exclusive: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23inputModeContext">Online Documentation</a>
 */
final override val inputModeContext: IInputModeContext?
/**
 * Gets or sets the event recognizer to detect the key gesture for new line breaks.
 * @see [cancelRecognizer]
 * @see [stopRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23lineBreakRecognizer">Online Documentation</a>
 */
final var lineBreakRecognizer: EventRecognizer
/**
 * Gets or sets the location of the text box in world coordinates.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23location">Online Documentation</a>
 */
final var location: IPoint
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23priority">Online Documentation</a>
 */
final override var priority: Int
/**
 * Gets or sets a value indiciating whether the text box should be rotated with the [upVector].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23rotateTextBox">Online Documentation</a>
 */
final var rotateTextBox: Boolean
/**
 * Gets or sets the event recognizer to detect when editing the text shall be stopped.
 * @see [lineBreakRecognizer]
 * @see [cancelRecognizer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23stopRecognizer">Online Documentation</a>
 */
final var stopRecognizer: EventRecognizer
/**
 * Gets or sets the padding to use around the [editorContainer] when it comes near to the viewport borders and needs to be adjusted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23textBoxPadding">Online Documentation</a>
 */
final var textBoxPadding: Insets
/**
 * Gets or sets the [textBoxPlacementPolicy] to use when the [editorContainer] isn't completely visible in the current [CanvasComponent.viewport][yfiles.view.CanvasComponent.viewport].
 * 
 * The default value is [TextBoxPlacementPolicy.SCROLL_CANVAS].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23textBoxPlacementPolicy">Online Documentation</a>
 */
final var textBoxPlacementPolicy: TextBoxPlacementPolicy
/**
 * Gets or sets the point that describes the "up"-vector that will be used to determine the orientation of the text box in the world coordinate system.
 * @see [rotateTextBox]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23upVector">Online Documentation</a>
 */
final var upVector: IPoint
/**
 * Adjusts the position of the text box in the [CanvasComponent][yfiles.view.CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-adjustPosition">Online Documentation</a>
 */
 open protected   fun adjustPosition()
/**
 * Adjusts the size of the text box in the [editorContainer].
 * @param [maxSize] The suggested maximum size to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-adjustSize">Online Documentation</a>
 */
 open protected   fun adjustSize( maxSize: Size )
/**
 * Calculates the maximum size for this instance.
 * @return The maximum size for the textbox.
 * @see [adjustSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-calculateMaxTextBoxSize">Online Documentation</a>
 */
 open protected   fun calculateMaxTextBoxSize():Size
/**
 * Cancels editing of the text box.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-cancel">Online Documentation</a>
 */
 override   fun cancel()
/**
 * Resets the contents of the text box.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-clear">Online Documentation</a>
 */
 open   fun clear()
/**
 * Creates the default editor and it's container div element.
 * @return The div that will be placed in the [CanvasComponent][yfiles.view.CanvasComponent] for editing the text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-createEditorContainer">Online Documentation</a>
 */
 open protected   fun createEditorContainer():HTMLDivElement
/**
 * Starts interactive text editing.
 * @return A Promise that will fulfill with the edited text or fulfill with `null` if editing is cancelled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-edit">Online Documentation</a>
 */
 final   fun edit():Promise<String?>
/**
 * Adjusts the [CanvasComponent.viewport][yfiles.view.CanvasComponent.viewport] of the [CanvasComponent][yfiles.view.CanvasComponent] such that the text box is in the visible area.
 * @see [textBoxPlacementPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-ensureVisible">Online Documentation</a>
 */
 open protected   fun ensureVisible()
/**
 * Installs this mode into the given context that is provided by the canvas.
 * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [IInputMode.uninstall]. A reference to the context may be kept and queried during the time the mode is installed.
 * @param [controller] The [controller] for this mode.
 * @see [IInputMode.uninstall]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Installs the [editorContainer] in the canvas and puts focus into it.
 * 
 * The default implementation also selects all text in default text box and sets the caret to the end of the text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-installTextBox">Online Documentation</a>
 */
 open protected   fun installTextBox()
/**
 * Called when editing starts.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onBeginEditing">Online Documentation</a>
 */
 open protected   fun onBeginEditing()
/**
 * Called when editing gets canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onCancelEditing">Online Documentation</a>
 */
 open protected   fun onCancelEditing()
/**
 * Called after [cancel] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onCanceled">Online Documentation</a>
 */
 open protected   fun onCanceled()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerActivated()
/**
 * Called after the [ConcurrencyController.active] property of the installed [ConcurrencyController] has been set to `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 open protected   fun onConcurrencyControllerDeactivated()
/**
 * Raises the [EditingCanceled] event.
 * @param [event] The event argument
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onEditingCanceled">Online Documentation</a>
 */
 open protected   fun onEditingCanceled( event: TextEventArgs )
/**
 * Raises the [EditingStarted] event.
 * @param [event] The event argument.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onEditingStarted">Online Documentation</a>
 */
 open protected   fun onEditingStarted( event: TextEventArgs )
/**
 * Called when editing is stopped.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onStopEditing">Online Documentation</a>
 */
 open protected   fun onStopEditing()
/**
 * Called after [tryStop] has been called.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onStopped">Online Documentation</a>
 */
 open protected   fun onStopped()
/**
 * Raises the [TextEdited] event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onTextEdited">Online Documentation</a>
 */
 open protected   fun onTextEdited( event: TextEventArgs )
/**
 * Stops editing and returns `true`.
 * @return `base.Stop()`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-tryStop">Online Documentation</a>
 */
 override   fun tryStop():Boolean
/**
 * Uninstalls this mode from the given context.
 * @param [context] The context to deregister from. This is the same instance that had been passed to [IInputMode.install] during installation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Removes the text box.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-uninstallTextBox">Online Documentation</a>
 */
 open protected   fun uninstallTextBox()
/**
 * Occurs once the text has been edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEdited">Online Documentation</a>
 */
fun addTextEditedListener(listener: EventHandler1<TextEventArgs>)
fun removeTextEditedListener(listener: EventHandler1<TextEventArgs>)

/**
 * Occurs if the editing has not been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23EditingCanceled">Online Documentation</a>
 */
fun addEditingCanceledListener(listener: EventHandler1<TextEventArgs>)
fun removeEditingCanceledListener(listener: EventHandler1<TextEventArgs>)

/**
 * Occurs when text editing is started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23EditingStarted">Online Documentation</a>
 */
fun addEditingStartedListener(listener: EventHandler1<TextEventArgs>)
fun removeEditingStartedListener(listener: EventHandler1<TextEventArgs>)

/**
 * Occurs when the [editor's text][editorText] should be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23EditorTextChanged">Online Documentation</a>
 */
fun addEditorTextChangedListener(listener: EventHandler1<TextEventArgs>)
fun removeEditorTextChangedListener(listener: EventHandler1<TextEventArgs>)

companion object : ClassMetadata<TextEditorInputMode> {
}
}

inline fun TextEditorInputMode(
    block: TextEditorInputMode.() -> Unit
): TextEditorInputMode {
    return TextEditorInputMode()
        .apply(block)
}

/**
 * Occurs once the text has been edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEdited">Online Documentation</a>
 */
inline fun  TextEditorInputMode.addTextEditedHandler(
    crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
    val listener: EventHandler1<TextEventArgs> = { _, event -> handler(event.context, event.text) }
    addTextEditedListener(listener)
    return { removeTextEditedListener(listener) }
}
/**
 * Occurs if the editing has not been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23EditingCanceled">Online Documentation</a>
 */
inline fun  TextEditorInputMode.addEditingCanceledHandler(
    crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
    val listener: EventHandler1<TextEventArgs> = { _, event -> handler(event.context, event.text) }
    addEditingCanceledListener(listener)
    return { removeEditingCanceledListener(listener) }
}
/**
 * Occurs when text editing is started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23EditingStarted">Online Documentation</a>
 */
inline fun  TextEditorInputMode.addEditingStartedHandler(
    crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
    val listener: EventHandler1<TextEventArgs> = { _, event -> handler(event.context, event.text) }
    addEditingStartedListener(listener)
    return { removeEditingStartedListener(listener) }
}
/**
 * Occurs when the [editor's text][editorText] should be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23EditorTextChanged">Online Documentation</a>
 */
inline fun  TextEditorInputMode.addEditorTextChangedHandler(
    crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
    val listener: EventHandler1<TextEventArgs> = { _, event -> handler(event.context, event.text) }
    addEditorTextChangedListener(listener)
    return { removeEditorTextChangedListener(listener) }
}
