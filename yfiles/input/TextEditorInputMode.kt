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
open external class TextEditorInputMode (
  editorContainer: HTMLDivElement?  = definedExternally,
) : IInputMode, IEventDispatcher {
  /**
   * Gets or sets the anchor of the text box.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23anchor">Online Documentation</a>
   */
  final var anchor: IPoint
  
  /**
   * Gets or sets whether the text edited should be committed or the editing should be canceled if the focus is lost.
   * 
   * The default behavior is to commit the edited text.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23autoCommitOnFocusLost">Online Documentation</a>
   */
  final var autoCommitOnFocusLost: Boolean
  
  /**
   * Gets or sets a value indicating whether to automatically flip the orientation of the text box if the [upVector][TextEditorInputMode] actually points downwards.
   * 
   * The default is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23autoFlipTextBox">Online Documentation</a>
   */
  final var autoFlipTextBox: Boolean
  
  /**
   * Gets or sets a property that determines whether this mode should try to [focus][yfiles.view.CanvasComponent] the [GraphComponent][yfiles.view.GraphComponent] once the editor is closed via a keyboard gesture.
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
   * Gets or sets the event recognizer that detects when editing the text should be canceled.
   * @see [lineBreakRecognizer]
   * @see [stopRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23cancelRecognizer">Online Documentation</a>
   */
  final var cancelRecognizer: EventRecognizer
  
  /**
   * Gets the installed [controller][TextEditorInputMode].
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
   * Gets or sets the event recognizer that detects the key gesture for new line breaks.
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
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets a value indicating whether the text box should be rotated with the [upVector][TextEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23rotateTextBox">Online Documentation</a>
   */
  final var rotateTextBox: Boolean
  
  /**
   * Gets or sets whether the content of the text editor should be selected when the textbox gets shown.
   * @see [initializeSelection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23selectContent">Online Documentation</a>
   */
  final var selectContent: Boolean
  
  /**
   * Gets or sets a property that determines whether the text editor should be closed on commit.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23stopEditingOnCommit">Online Documentation</a>
   */
  final var stopEditingOnCommit: Boolean
  
  /**
   * Gets or sets the event recognizer to detect when editing the text should be stopped.
   * @see [lineBreakRecognizer]
   * @see [cancelRecognizer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23stopRecognizer">Online Documentation</a>
   */
  final var stopRecognizer: EventRecognizer
  
  /**
   * Gets or sets the margins to use around the [editorContainer][TextEditorInputMode] when it comes near to the viewport borders and needs to be adjusted.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23textBoxMargins">Online Documentation</a>
   */
  final var textBoxMargins: Insets
  
  /**
   * Gets or sets the [textBoxPlacementPolicy][TextEditorInputMode] to use when the [editorContainer][TextEditorInputMode] isn't completely visible in the current [viewport][yfiles.view.CanvasComponent].
   * 
   * The default value is [MOVE_TEXT_BOX][TextBoxPlacementPolicy].
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
  protected open fun adjustPosition()
  
  /**
   * Adjusts the size of the text box in the [editorContainer][TextEditorInputMode].
   * @param [maxSize] The suggested maximum size to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-adjustSize">Online Documentation</a>
   */
  protected open fun adjustSize(
    maxSize: Size,
  )
  
  /**
   * Calculates the maximum size for this instance.
   * @return The maximum size for the textbox.
   * @see [adjustSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-calculateMaxTextBoxSize">Online Documentation</a>
   */
  protected open fun calculateMaxTextBoxSize(): Size
  
  /**
   * Cancels editing of the text box.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Resets the contents of the text box.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-clear">Online Documentation</a>
   */
  open fun clear()
  
  /**
   * Creates the default editor and it's container div element.
   * @return The div that will be placed in the [CanvasComponent][yfiles.view.CanvasComponent] for editing the text.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-createEditorContainer">Online Documentation</a>
   */
  protected open fun createEditorContainer(): HTMLDivElement
  
  /**
   * Starts interactive text editing.
   * @return A Promise that will fulfill with the edited text or fulfill with `null` if editing is cancelled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-edit">Online Documentation</a>
   */
  fun edit(): Promise<String?>
  
  /**
   * Adjusts the [viewport][yfiles.view.CanvasComponent] of the [CanvasComponent][yfiles.view.CanvasComponent] such that the text box is in the visible area.
   * @see [textBoxPlacementPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-ensureVisible">Online Documentation</a>
   */
  protected open fun ensureVisible()
  
  /**
   * Helper method called by [installTextBox][TextEditorInputMode] that sets the initial caret location and selects the text.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-initializeSelection">Online Documentation</a>
   */
  protected open fun initializeSelection()
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][TextEditorInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Installs the [editorContainer][TextEditorInputMode] in the canvas and puts focus into it.
   * 
   * The default implementation also selects all text in default text box and sets the caret to the end of the text.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-installTextBox">Online Documentation</a>
   */
  protected open fun installTextBox()
  
  /**
   * Called when editing starts.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onBeginEditing">Online Documentation</a>
   */
  protected open fun onBeginEditing()
  
  /**
   * Called when editing gets canceled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onCancelEditing">Online Documentation</a>
   */
  protected open fun onCancelEditing()
  
  /**
   * Called after [cancel][TextEditorInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Raises the [editing-canceled][TextEditorInputMode] event.
   * @param [event] The event argument
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onEditingCanceled">Online Documentation</a>
   */
  protected open fun onEditingCanceled(
    event: TextEventArgs,
  )
  
  /**
   * Raises the [editing-started][TextEditorInputMode] event.
   * @param [event] The event argument.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onEditingStarted">Online Documentation</a>
   */
  protected open fun onEditingStarted(
    event: TextEventArgs,
  )
  
  /**
   * Called when editing is stopped.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onStopEditing">Online Documentation</a>
   */
  protected open fun onStopEditing()
  
  /**
   * Called after [tryStop][TextEditorInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Raises the [text-edited][TextEditorInputMode] event.
   * @param [event] The event arguments.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-onTextEdited">Online Documentation</a>
   */
  protected open fun onTextEdited(
    event: TextEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  /**
   * Removes the text box.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23TextEditorInputMode-method-uninstallTextBox">Online Documentation</a>
   */
  protected open fun uninstallTextBox()
  
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
 * `text-edited`: Occurs once the text has been edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23text-edited">Online Documentation</a>
 */
inline fun  TextEditorInputMode.addTextEditedHandler(
  crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
  val listener: EventHandler1<TextEventArgs> = { event, _ -> handler(event.context, event.text) }
  addEventListener("text-edited", listener)
  return { removeEventListener("text-edited", listener) }
}

/**
 * `editing-canceled`: Occurs if the editing has not been finished.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23editing-canceled">Online Documentation</a>
 */
inline fun  TextEditorInputMode.addEditingCanceledHandler(
  crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
  val listener: EventHandler1<TextEventArgs> = { event, _ -> handler(event.context, event.text) }
  addEventListener("editing-canceled", listener)
  return { removeEventListener("editing-canceled", listener) }
}

/**
 * `editing-started`: Occurs when text editing is started.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23editing-started">Online Documentation</a>
 */
inline fun  TextEditorInputMode.addEditingStartedHandler(
  crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
  val listener: EventHandler1<TextEventArgs> = { event, _ -> handler(event.context, event.text) }
  addEventListener("editing-started", listener)
  return { removeEventListener("editing-started", listener) }
}

/**
 * `editor-text-changed`: Occurs when the [editor's text][TextEditorInputMode] should be changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextEditorInputMode%23editor-text-changed">Online Documentation</a>
 */
inline fun  TextEditorInputMode.addEditorTextChangedHandler(
  crossinline handler: (context:IInputModeContext, text:String) -> Unit
): () -> Unit {
  val listener: EventHandler1<TextEventArgs> = { event, _ -> handler(event.context, event.text) }
  addEventListener("editor-text-changed", listener)
  return { removeEventListener("editor-text-changed", listener) }
}
