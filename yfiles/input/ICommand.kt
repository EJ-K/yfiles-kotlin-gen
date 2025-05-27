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
import yfiles.geometry.Insets
import yfiles.geometry.Rect
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.ILabelOwner
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.lang.EventHandler
import yfiles.lang.IEventDispatcher
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Base interface for a command that can be executed.
 * @see [createCommand]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand">Online Documentation</a>
 */
external interface ICommand<in T : Any> : YObject, IEventDispatcher {
/**
 * Determines whether this command be executed with respect to the given parameter and target.
 * @param [parameter] The parameter or `null`
 * @param [target] The target to execute the command on or `null`
 * @return Whether [execute] can be called with the given `parameter` and `target`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ICommand-method-canExecute">Online Documentation</a>
 */
   fun canExecute( parameter: T?  = definedExternally,
 target: Any?  = definedExternally):Boolean
/**
 * Executes this command with respect to the given parameter and target.
 * @param [parameter] The parameter or `null`
 * @param [target] The target to execute the command on or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ICommand-method-execute">Online Documentation</a>
 */
   fun execute( parameter: T?  = definedExternally,
 target: Any?  = definedExternally)
/**
 * Occurs when the result of a call to [canExecute] may yield a different result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23CanExecuteChanged">Online Documentation</a>
 */
fun addCanExecuteChangedListener(listener: EventHandler)
fun removeCanExecuteChangedListener(listener: EventHandler)

companion object : InterfaceMetadata<ICommand<*>> {
/**
 * A [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [add another label][GraphEditorInputMode.addLabel] to the [ILabelOwner] that is specified by the command parameter.
 * 
 * If the parameter to this command is an [ILabelOwner] instance, then we will use that item.
 * If the parameter is `null` and there is exactly one selected [ILabelOwner], then we will use the selected item. If we there is no [ILabelOwner] found and the [GraphEditorInputMode] is used, this will trigger the [GraphEditorInputMode.onAddLabel].
 * The default shortcut for this command is `Shift+F2`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ADD_LABEL">Online Documentation</a>
 */
 val ADD_LABEL: ICommand<ILabelOwner>
/**
 * A [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [adjust the size of group nodes][GraphEditorInputMode.adjustGroupNodeSize].
 * 
 * If the parameter to this command is `null`, the sizes of the currently selected group nodes are adjusted.
 * If the parameter is an [INode] instance, the size of that group node will be adjusted.
 * If the parameter is an [IEnumerable][yfiles.collections.IEnumerable] instance, then the sizes of all group nodes in that enumeration are adjusted.
 * The default shortcut for this command is `Ctrl-Shift-G`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ADJUST_GROUP_NODE_SIZE">Online Documentation</a>
 */
 val ADJUST_GROUP_NODE_SIZE: ICommand<INode>
/**
 * A [ICommand] that [CreateEdgeInputMode] instances can execute if they have been [installed][IInputMode.install] in a [CanvasComponent][yfiles.view.CanvasComponent].
 * 
 * If this command gets executed, the command parameter is inspected to see if it is set to either an [IPortCandidate], an [IPort][yfiles.graph.IPort], or an [INode] that is an element in the currently edited graph instance. If so, method [CreateEdgeInputMode.doStartEdgeCreation] will be invoked and the user can finish the edge creation gesture.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23BEGIN_EDGE_CREATION">Online Documentation</a>
 */
 val BEGIN_EDGE_CREATION: ICommand<IPortCandidate>
/**
 * An [ICommand] to close a document.
 * 
 * This command is not necessarily handled by yFiles. Application writers can handle the command in a manner that makes sense in the context of the application, e.g. closing the current window.
 * There is no default shortcut for this command.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23CLOSE">Online Documentation</a>
 */
 val CLOSE: ICommand<Nothing>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [collapse][NavigationInputMode.collapseGroup] group nodes.
 * 
 * If the parameter to this command is `null`, the currently selected group nodes are collapsed.
 * If the parameter is an [INode] instance, that group node will be collapsed.
 * If the parameter is an [IEnumerable][yfiles.collections.IEnumerable] instance, then all group nodes in that enumeration are collapsed.
 * The default shortcut for this command is `Ctrl+Subtract` or `Ctrl+OemMinus`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23COLLAPSE_GROUP">Online Documentation</a>
 */
 val COLLAPSE_GROUP: ICommand<INode>
/**
 * An [ICommand] to copy to the clipboard.
 * 
 * [GraphViewerInputMode] and [GraphEditorInputMode] handle this command in conjunction with [GraphClipboard][yfiles.graph.GraphClipboard].
 * The default shortcuts for this command are `Ctrl+C` and `Ctrl+Ins`.
 * @see [CUT]
 * @see [PASTE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23COPY">Online Documentation</a>
 */
 val COPY: ICommand<Nothing>
/**
 * An [ICommand] to cut an item and place it in the clipboard.
 * 
 * [GraphEditorInputMode] handles this command in conjunction with [GraphClipboard][yfiles.graph.GraphClipboard].
 * The default shortcuts for this command are `Ctrl+X` and `Shift+Del`.
 * @see [COPY]
 * @see [PASTE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23CUT">Online Documentation</a>
 */
 val CUT: ICommand<Nothing>
/**
 * An [ICommand] to decrease the zoom level.
 * 
 * [CanvasComponent][yfiles.view.CanvasComponent] handles this command to decrease the zoom level by 20%. A different factor from the default `1.2` may be given as the command parameter.
 * There is no default shortcut for this command.
 * @see [INCREASE_ZOOM]
 * @see [ZOOM]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23DECREASE_ZOOM">Online Documentation</a>
 */
 val DECREASE_ZOOM: ICommand<Double>
/**
 * An [ICommand] to delete an item.
 * 
 * [GraphEditorInputMode] handles this command to delete the currently selected items.
 * The default shortcut for this command is `Del`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23DELETE">Online Documentation</a>
 */
 val DELETE: ICommand<Nothing>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [clear the selection][yfiles.view.ISelectionModel.clear].
 * 
 * The default shortcut for this command is `Ctrl+Shift+A`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23DESELECT_ALL">Online Documentation</a>
 */
 val DESELECT_ALL: ICommand<Nothing>
/**
 * A [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [deselect][GraphInputMode.setSelected] an item.
 * 
 * If the parameter to this command is an [IModelItem] instance, then that item will be deselected.
 * If the parameter is `null` and there is exactly one selected item, then the selected item will be deselected.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23DESELECT_ITEM">Online Documentation</a>
 */
 val DESELECT_ITEM: ICommand<IModelItem>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [duplicate items][yfiles.graph.GraphClipboard.duplicate] of the current [IGraph][yfiles.graph.IGraph].
 * 
 * The default shortcut for this command is `Ctrl+D`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23DUPLICATE">Online Documentation</a>
 */
 val DUPLICATE: ICommand<Nothing>
/**
 * A [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [edit][GraphEditorInputMode.editLabel] an label.
 * 
 * We first determine the item to edit: If the parameter to this command is an [IModelItem] instance, then we will use that item.
 * If the parameter is `null` and there is exactly one selected item, then we will use the selected item.
 * Then we determine the label to edit from the given item: If the item is an [ILabel] instance, then that label will be edited.
 * If the item is an [ILabelOwner] instance with an editable label, then that label will be edited.
 * If the item is an [ILabelOwner] instance with no editable label, then an new label will be added and edited. Otherwise this will trigger the [GraphEditorInputMode.onEditLabel] if [GraphEditorInputMode] is used.
 * The default shortcut for this command is `F2`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23EDIT_LABEL">Online Documentation</a>
 */
 val EDIT_LABEL: ICommand<ILabel>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [switch the local root][yfiles.graph.IFoldingView.localRoot] of the current [IFoldingView][yfiles.graph.IFoldingView] view to the given group node.
 * 
 * If the parameter to this command is `null`, the currently selected group node is entered.
 * If the parameter is an [INode] instance that is a group node, that group node will be entered.
 * The default shortcut for this command is `Ctrl+Enter`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ENTER_GROUP">Online Documentation</a>
 */
 val ENTER_GROUP: ICommand<INode>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [exit the current local root][yfiles.graph.IFoldingView.localRoot] of the current [IFoldingView][yfiles.graph.IFoldingView] view to the given parent view.
 * 
 * The default shortcut for this command is `Ctrl+Backspace`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23EXIT_GROUP">Online Documentation</a>
 */
 val EXIT_GROUP: ICommand<Nothing>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [expand][NavigationInputMode.expandGroup] group nodes.
 * 
 * If the parameter to this command is `null`, the currently selected group nodes are expanded.
 * If the parameter is an [INode] instance, that node will be expanded.
 * If the parameter is an [IEnumerable][yfiles.collections.IEnumerable] instance, then all group nodes in that enumeration are expanded.
 * The default shortcut for this command is `Ctrl+Add` or `Ctrl+Oemplus`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23EXPAND_GROUP">Online Documentation</a>
 */
 val EXPAND_GROUP: ICommand<INode>
/**
 * An [ICommand] to extend the selection downwards.
 * 
 * [NavigationInputMode] handles this command to extend the selection with the next item below.
 * The default shortcut for this command is `Shift+Arrow Down`.
 * @see [EXTEND_SELECTION_UP]
 * @see [EXTEND_SELECTION_LEFT]
 * @see [EXTEND_SELECTION_RIGHT]
 * @see [SELECT_TO_PAGE_UP]
 * @see [SELECT_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23EXTEND_SELECTION_DOWN">Online Documentation</a>
 */
 val EXTEND_SELECTION_DOWN: ICommand<Nothing>
/**
 * An [ICommand] to extend the selection to the left.
 * 
 * [NavigationInputMode] handles this command to extend the selection with the next item to the left.
 * The default shortcut for this command is `Shift+Arrow Left`.
 * @see [EXTEND_SELECTION_UP]
 * @see [EXTEND_SELECTION_DOWN]
 * @see [EXTEND_SELECTION_RIGHT]
 * @see [SELECT_TO_PAGE_UP]
 * @see [SELECT_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23EXTEND_SELECTION_LEFT">Online Documentation</a>
 */
 val EXTEND_SELECTION_LEFT: ICommand<Nothing>
/**
 * An [ICommand] to extend the selection to the right.
 * 
 * [NavigationInputMode] handles this command to extend the selection with the next item to the right.
 * The default shortcut for this command is `Shift+Arrow Right`.
 * @see [EXTEND_SELECTION_UP]
 * @see [EXTEND_SELECTION_DOWN]
 * @see [EXTEND_SELECTION_LEFT]
 * @see [SELECT_TO_PAGE_UP]
 * @see [SELECT_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23EXTEND_SELECTION_RIGHT">Online Documentation</a>
 */
 val EXTEND_SELECTION_RIGHT: ICommand<Nothing>
/**
 * An [ICommand] to extend the selection upwards.
 * 
 * [NavigationInputMode] handles this command to extend the selection with the next item above.
 * The default shortcut for this command is `Shift+Arrow Up`.
 * @see [EXTEND_SELECTION_DOWN]
 * @see [EXTEND_SELECTION_LEFT]
 * @see [EXTEND_SELECTION_RIGHT]
 * @see [SELECT_TO_PAGE_UP]
 * @see [SELECT_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23EXTEND_SELECTION_UP">Online Documentation</a>
 */
 val EXTEND_SELECTION_UP: ICommand<Nothing>
/**
 * An [ICommand] that invokes [CanvasComponent.fitContent][yfiles.view.CanvasComponent.fitContent] if executed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23FIT_CONTENT">Online Documentation</a>
 */
 val FIT_CONTENT: ICommand<Nothing>
/**
 * The [ICommand] that performs the [GraphComponent.fitGraphBounds][yfiles.view.GraphComponent.fitGraphBounds] action.
 * 
 * The parameter can be either an [Insets] or convertible that will be used to create an appropriately sized insets object from.
 * This command considers margins defined by [CanvasComponent.contentMargins][yfiles.view.CanvasComponent.contentMargins]. The margins define the visible whitespace around the actual [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23FIT_GRAPH_BOUNDS">Online Documentation</a>
 */
 val FIT_GRAPH_BOUNDS: ICommand<Insets>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [group the currently selected items][GraphEditorInputMode.groupSelection].
 * 
 * The default shortcut for this command is `Ctrl+G`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23GROUP_SELECTION">Online Documentation</a>
 */
 val GROUP_SELECTION: ICommand<Nothing>
/**
 * An [ICommand] to open help.
 * 
 * This command is not necessarily handled by yFiles. Application writers can handle the command in a manner that makes sense in the context of the application, e.g. showing the online help.
 * The default shortcut for this command is `F1`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23HELP">Online Documentation</a>
 */
 val HELP: ICommand<Nothing>
/**
 * An [ICommand] to increase the zoom level.
 * 
 * [CanvasComponent][yfiles.view.CanvasComponent] handles this command to increase the zoom level by 20%. A different factor from the default `1.2` may be given as the command parameter.
 * There is no default shortcut for this command.
 * @see [DECREASE_ZOOM]
 * @see [ZOOM]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23INCREASE_ZOOM">Online Documentation</a>
 */
 val INCREASE_ZOOM: ICommand<Double>
/**
 * A [ICommand] that lowers the visual representations of [IModelItem]s one step to back.
 * 
 * Lowers the [main canvas objects][yfiles.view.GraphModelManager.getMainCanvasObject] of [IModelItem]s in their [parent group][yfiles.view.ICanvasObject.group] one step to back.
 * [GraphEditorInputMode] can execute this command if it is installed in a [GraphComponent][yfiles.view.GraphComponent] and. As command parameter the following values are accepted:
 * 
 * - `null`, in which case the [GraphComponent.selection][yfiles.view.GraphComponent.selection] is lowered or the [GraphComponent.currentItem][yfiles.view.GraphComponent.currentItem] if [GraphEditorInputMode.useCurrentItemForCommands] is set.
 * - a single [IModelItem] that shall be lowered.
 * - an [IEnumerable][yfiles.collections.IEnumerable] which shall be lowered.
 * @see [GraphModelManager.lower][yfiles.view.GraphModelManager.lower]
 * @see [GraphEditorInputMode.lowerSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23LOWER">Online Documentation</a>
 */
 val LOWER: ICommand<IModelItem>
/**
 * An [ICommand] to move the selection down.
 * 
 * [NavigationInputMode] handles this command to select the next item below.
 * The default shortcut for this command is `Arrow Down`.
 * @see [MOVE_UP]
 * @see [MOVE_LEFT]
 * @see [MOVE_RIGHT]
 * @see [MOVE_TO_PAGE_UP]
 * @see [MOVE_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_DOWN">Online Documentation</a>
 */
 val MOVE_DOWN: ICommand<Nothing>
/**
 * An [ICommand] to move the focus backwards.
 * 
 * [NavigationInputMode] handles this command to focus the next item to the left.
 * The default shortcut for this command is `Ctrl+Arrow Left`.
 * @see [MOVE_FOCUS_FORWARD]
 * @see [MOVE_FOCUS_UP]
 * @see [MOVE_FOCUS_DOWN]
 * @see [MOVE_FOCUS_PAGE_UP]
 * @see [MOVE_FOCUS_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_FOCUS_BACK">Online Documentation</a>
 */
 val MOVE_FOCUS_BACK: ICommand<Nothing>
/**
 * An [ICommand] to move the focus downwards.
 * 
 * [NavigationInputMode] handles this command to focus the next item below.
 * The default shortcut for this command is `Ctrl+Arrow Down`.
 * @see [MOVE_FOCUS_BACK]
 * @see [MOVE_FOCUS_FORWARD]
 * @see [MOVE_FOCUS_UP]
 * @see [MOVE_FOCUS_PAGE_UP]
 * @see [MOVE_FOCUS_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_FOCUS_DOWN">Online Documentation</a>
 */
 val MOVE_FOCUS_DOWN: ICommand<Nothing>
/**
 * An [ICommand] to move the focus forwards.
 * 
 * [NavigationInputMode] handles this command to focus the next item to the right.
 * The default shortcut for this command is `Ctrl+Arrow Right`.
 * @see [MOVE_FOCUS_BACK]
 * @see [MOVE_FOCUS_UP]
 * @see [MOVE_FOCUS_DOWN]
 * @see [MOVE_FOCUS_PAGE_UP]
 * @see [MOVE_FOCUS_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_FOCUS_FORWARD">Online Documentation</a>
 */
 val MOVE_FOCUS_FORWARD: ICommand<Nothing>
/**
 * An [ICommand] to move the focus up a page.
 * 
 * [NavigationInputMode] handles this command to focus the first child node, if possible.
 * The default shortcut for this command is `Ctrl+Page Down`.
 * @see [MOVE_FOCUS_BACK]
 * @see [MOVE_FOCUS_FORWARD]
 * @see [MOVE_FOCUS_UP]
 * @see [MOVE_FOCUS_DOWN]
 * @see [MOVE_FOCUS_PAGE_UP]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_FOCUS_PAGE_DOWN">Online Documentation</a>
 */
 val MOVE_FOCUS_PAGE_DOWN: ICommand<Nothing>
/**
 * An [ICommand] to move the focus up a page.
 * 
 * [NavigationInputMode] handles this command to focus the parent node, if possible.
 * The default shortcut for this command is `Ctrl+Page Up`.
 * @see [MOVE_FOCUS_BACK]
 * @see [MOVE_FOCUS_FORWARD]
 * @see [MOVE_FOCUS_UP]
 * @see [MOVE_FOCUS_DOWN]
 * @see [MOVE_FOCUS_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_FOCUS_PAGE_UP">Online Documentation</a>
 */
 val MOVE_FOCUS_PAGE_UP: ICommand<Nothing>
/**
 * An [ICommand] to move the focus upwards.
 * 
 * [NavigationInputMode] handles this command to focus the next item above.
 * The default shortcut for this command is `Ctrl+Arrow Up`.
 * @see [MOVE_FOCUS_BACK]
 * @see [MOVE_FOCUS_FORWARD]
 * @see [MOVE_FOCUS_DOWN]
 * @see [MOVE_FOCUS_PAGE_UP]
 * @see [MOVE_FOCUS_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_FOCUS_UP">Online Documentation</a>
 */
 val MOVE_FOCUS_UP: ICommand<Nothing>
/**
 * An [ICommand] to move the selection left.
 * 
 * [NavigationInputMode] handles this command to select the next item to the left.
 * The default shortcut for this command is `Arrow Left`.
 * @see [MOVE_UP]
 * @see [MOVE_DOWN]
 * @see [MOVE_RIGHT]
 * @see [MOVE_TO_PAGE_UP]
 * @see [MOVE_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_LEFT">Online Documentation</a>
 */
 val MOVE_LEFT: ICommand<Nothing>
/**
 * An [ICommand] to move the selection right.
 * 
 * [NavigationInputMode] handles this command to select the next item to the right.
 * The default shortcut for this command is `Arrow Right`.
 * @see [MOVE_UP]
 * @see [MOVE_DOWN]
 * @see [MOVE_LEFT]
 * @see [MOVE_TO_PAGE_UP]
 * @see [MOVE_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_RIGHT">Online Documentation</a>
 */
 val MOVE_RIGHT: ICommand<Nothing>
/**
 * An [ICommand] to move the selection down a page.
 * 
 * [NavigationInputMode] handles this command to select the first child node, if possible.
 * The default shortcut for this command is `Page Down`.
 * @see [MOVE_UP]
 * @see [MOVE_DOWN]
 * @see [MOVE_LEFT]
 * @see [MOVE_RIGHT]
 * @see [MOVE_TO_PAGE_UP]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_TO_PAGE_DOWN">Online Documentation</a>
 */
 val MOVE_TO_PAGE_DOWN: ICommand<Nothing>
/**
 * An [ICommand] to move the selection up a page.
 * 
 * [NavigationInputMode] handles this command to select the parent node, if possible.
 * The default shortcut for this command is `Page Up`.
 * @see [MOVE_UP]
 * @see [MOVE_DOWN]
 * @see [MOVE_LEFT]
 * @see [MOVE_RIGHT]
 * @see [MOVE_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_TO_PAGE_UP">Online Documentation</a>
 */
 val MOVE_TO_PAGE_UP: ICommand<Nothing>
/**
 * An [ICommand] to move the selection up.
 * 
 * [NavigationInputMode] handles this command to select the next item above.
 * The default shortcut for this command is `Arrow Up`.
 * @see [MOVE_DOWN]
 * @see [MOVE_LEFT]
 * @see [MOVE_RIGHT]
 * @see [MOVE_TO_PAGE_UP]
 * @see [MOVE_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23MOVE_UP">Online Documentation</a>
 */
 val MOVE_UP: ICommand<Nothing>
/**
 * An [ICommand] to create a new document.
 * 
 * This command is not necessarily handled by yFiles. Application writers can handle the command in a manner that makes sense in the context of the application, e.g. creating a new graph.
 * The default shortcut for this command is `Ctrl+N`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23NEW">Online Documentation</a>
 */
 val NEW: ICommand<Nothing>
/**
 * An [ICommand] to open a document.
 * 
 * [GraphComponent][yfiles.view.GraphComponent] handles this command to open a dialog prompting to open a GraphML file.
 * The default shortcut for this command is `Ctrl+O`.
 * @see [SAVE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23OPEN">Online Documentation</a>
 */
 val OPEN: ICommand<Nothing>
/**
 * An [ICommand] to paste from the clipboard.
 * 
 * [GraphEditorInputMode] handles this command in conjunction with [GraphClipboard][yfiles.graph.GraphClipboard]. The command parameter can be an [IPoint] to specify a location for pasting.
 * The default shortcuts for this command are `Ctrl+V` and `Shift+Ins`.
 * @see [CUT]
 * @see [COPY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23PASTE">Online Documentation</a>
 */
 val PASTE: ICommand<IPoint>
/**
 * An [ICommand] to print.
 * 
 * This command is not necessarily handled by yFiles. Application writers can handle the command in a manner that makes sense in the context of the application, e.g. printing the currently visible portion of the graph.
 * The default shortcut for this command is `Ctrl+P`.
 * @see [PRINT_PREVIEW]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23PRINT">Online Documentation</a>
 */
 val PRINT: ICommand<Nothing>
/**
 * An [ICommand] that indicates the intention to print and show a preview of what to print beforehand.
 * 
 * This command is not necessarily handled by yFiles. Application writers can handle the command in a manner that makes sense in the context of the application.
 * The default shortcut for this command is `Ctrl+F2`.
 * @see [PRINT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23PRINT_PREVIEW">Online Documentation</a>
 */
 val PRINT_PREVIEW: ICommand<Nothing>
/**
 * An [ICommand] to show properties of an item.
 * 
 * This command is not necessarily handled by yFiles. Application writers can handle the command in a manner that makes sense in the context of the application.
 * There is no default shortcut for this command.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23PROPERTIES">Online Documentation</a>
 */
 val PROPERTIES: ICommand<Nothing>
/**
 * A [ICommand] that raises the visual representations of [IModelItem]s one step to the front.
 * 
 * Raises the [main canvas objects][yfiles.view.GraphModelManager.getMainCanvasObject] of [IModelItem]s in their [parent group][yfiles.view.ICanvasObject.group] one step to the front.
 * [GraphEditorInputMode] can execute this command if it is installed in a [GraphComponent][yfiles.view.GraphComponent]. As command parameter the following values are accepted:
 * 
 * - `null`, in which case the [GraphComponent.selection][yfiles.view.GraphComponent.selection] is raised or the [GraphComponent.currentItem][yfiles.view.GraphComponent.currentItem] if [GraphEditorInputMode.useCurrentItemForCommands] is set.
 * - a single [IModelItem] that shall be raised.
 * - an [IEnumerable][yfiles.collections.IEnumerable] which shall be raised.
 * @see [GraphModelManager.raise][yfiles.view.GraphModelManager.raise]
 * @see [GraphEditorInputMode.raiseSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23RAISE">Online Documentation</a>
 */
 val RAISE: ICommand<IModelItem>
/**
 * An [ICommand] to redo a previously undone operation.
 * 
 * [GraphEditorInputMode] handles this command in conjunction with [UndoEngine][yfiles.graph.UndoEngine].
 * The default shortcut for this command is `Ctrl+Y`.
 * @see [UNDO]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23REDO">Online Documentation</a>
 */
 val REDO: ICommand<Nothing>
/**
 * An [ICommand] that reverses the direction of edges.
 * 
 * [GraphEditorInputMode] can execute this command if it is installed in a [GraphComponent][yfiles.view.GraphComponent]. The command parameter specifies the edges to be reversed and can be an [IEdge], an [IEnumerable<IEdge>][yfiles.collections.IEnumerable] or `null`.
 * If the parameter is `null` the currently selected edges will be reversed.
 * The default shortcut for this command is `Ctrl+R`.
 * @see [GraphEditorInputMode.reverseEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23REVERSE_EDGE">Online Documentation</a>
 */
 val REVERSE_EDGE: ICommand<IEdge>
/**
 * An [ICommand] to save an item.
 * 
 * [GraphComponent][yfiles.view.GraphComponent] handles this command to open a dialog prompting to save the graph as a GraphML file, if the graph was never saved before, and simply saving to the previous file name if it was.
 * The default shortcut for this command is `Ctrl+S`.
 * @see [OPEN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SAVE">Online Documentation</a>
 */
 val SAVE: ICommand<Nothing>
/**
 * An [ICommand] to scroll down.
 * 
 * [CanvasComponent][yfiles.view.CanvasComponent] handles this command to move the viewport downwards. By default this is done by a full viewport height. The parameter can be a factor that is applied to the viewport height to move the viewport by a different amount.
 * The default shortcut for this command is `Page Down`.
 * @see [SCROLL_PAGE_UP]
 * @see [SCROLL_PAGE_LEFT]
 * @see [SCROLL_PAGE_RIGHT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SCROLL_PAGE_DOWN">Online Documentation</a>
 */
 val SCROLL_PAGE_DOWN: ICommand<Double>
/**
 * An [ICommand] to scroll left.
 * 
 * [CanvasComponent][yfiles.view.CanvasComponent] handles this command to move the viewport to the left. By default this is done by a full viewport width. The parameter can be a factor that is applied to the viewport width to move the viewport by a different amount.
 * There is no default shortcut for this command.
 * @see [SCROLL_PAGE_UP]
 * @see [SCROLL_PAGE_DOWN]
 * @see [SCROLL_PAGE_RIGHT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SCROLL_PAGE_LEFT">Online Documentation</a>
 */
 val SCROLL_PAGE_LEFT: ICommand<Double>
/**
 * An [ICommand] to scroll right.
 * 
 * [CanvasComponent][yfiles.view.CanvasComponent] handles this command to move the viewport to the right. By default this is done by a full viewport width. The parameter can be a factor that is applied to the viewport width to move the viewport by a different amount.
 * There is no default shortcut for this command.
 * @see [SCROLL_PAGE_UP]
 * @see [SCROLL_PAGE_DOWN]
 * @see [SCROLL_PAGE_LEFT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SCROLL_PAGE_RIGHT">Online Documentation</a>
 */
 val SCROLL_PAGE_RIGHT: ICommand<Double>
/**
 * An [ICommand] to scroll up.
 * 
 * [CanvasComponent][yfiles.view.CanvasComponent] handles this command to move the viewport upwards. By default this is done by a full viewport height. The parameter can be a factor that is applied to the viewport height to move the viewport by a different amount.
 * The default shortcut for this command is `Page Up`.
 * @see [SCROLL_PAGE_DOWN]
 * @see [SCROLL_PAGE_LEFT]
 * @see [SCROLL_PAGE_RIGHT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SCROLL_PAGE_UP">Online Documentation</a>
 */
 val SCROLL_PAGE_UP: ICommand<Double>
/**
 * An [ICommand] to select all items.
 * 
 * [GraphEditorInputMode] and [GraphViewerInputMode] handle this command to select all items in the graph.
 * The default shortcut for this command is `Ctrl+A`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SELECT_ALL">Online Documentation</a>
 */
 val SELECT_ALL: ICommand<Nothing>
/**
 * A [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [select][GraphInputMode.setSelected] an item.
 * 
 * If the parameter to this command is an [IModelItem] instance, then that item will be selected.
 * If the parameter is `null` and there is exactly one selected item, then that item remains selected. Otherwise the [current item][yfiles.view.GraphComponent.currentItem] will be selected.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SELECT_ITEM">Online Documentation</a>
 */
 val SELECT_ITEM: ICommand<IModelItem>
/**
 * An [ICommand] to extend the selection a page downwards.
 * 
 * [NavigationInputMode] handles this command to extend the selection with the first child node, if possible.
 * The default shortcut for this command is `Shift+Page Down`.
 * @see [EXTEND_SELECTION_UP]
 * @see [EXTEND_SELECTION_DOWN]
 * @see [EXTEND_SELECTION_LEFT]
 * @see [EXTEND_SELECTION_RIGHT]
 * @see [SELECT_TO_PAGE_UP]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SELECT_TO_PAGE_DOWN">Online Documentation</a>
 */
 val SELECT_TO_PAGE_DOWN: ICommand<Nothing>
/**
 * An [ICommand] to extend the selection a page upwards.
 * 
 * [NavigationInputMode] handles this command to extend the selection with the parent node, if possible.
 * The default shortcut for this command is `Shift+Page Up`.
 * @see [EXTEND_SELECTION_UP]
 * @see [EXTEND_SELECTION_DOWN]
 * @see [EXTEND_SELECTION_LEFT]
 * @see [EXTEND_SELECTION_RIGHT]
 * @see [SELECT_TO_PAGE_DOWN]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SELECT_TO_PAGE_UP">Online Documentation</a>
 */
 val SELECT_TO_PAGE_UP: ICommand<Nothing>
/**
 * An [ICommand] that invokes [GraphComponent.currentItem][yfiles.view.GraphComponent.currentItem] if executed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23SET_CURRENT_ITEM">Online Documentation</a>
 */
 val SET_CURRENT_ITEM: ICommand<IModelItem>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [toggle][NavigationInputMode.toggleExpansionState] the collapsed/expanded state of currently selected group nodes.
 * 
 * If the parameter to this command is `null`, the currently selected group nodes are toggled.
 * If the parameter is an [INode] instance, that group node will be toggled.
 * If the parameter is an [IEnumerable][yfiles.collections.IEnumerable] instance, then all group nodes in that enumeration are toggled.
 * The default shortcut for this command is `Ctrl+Multiply`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23TOGGLE_EXPANSION_STATE">Online Documentation</a>
 */
 val TOGGLE_EXPANSION_STATE: ICommand<INode>
/**
 * A [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [toggle the selection state][GraphInputMode.setSelected] of an item.
 * 
 * If the parameter to this command is an [IModelItem] instance, then the selection state of that item will be toggled.
 * If the parameter is `null` and there is exactly one selected item, then the selected item will be deselected. Otherwise the selection state of [current item][yfiles.view.GraphComponent.currentItem] will be toggled.
 * The default shortcut for this command is `Ctrl-Space`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23TOGGLE_ITEM_SELECTION">Online Documentation</a>
 */
 val TOGGLE_ITEM_SELECTION: ICommand<IModelItem>
/**
 * A [ICommand] that brings the visual representations of [IModelItem]s to back.
 * 
 * Brings the [main canvas objects][yfiles.view.GraphModelManager.getMainCanvasObject] of [IModelItem]s in their [parent group][yfiles.view.ICanvasObject.group] to back.
 * [GraphEditorInputMode] can execute this command if it is installed in a [GraphComponent][yfiles.view.GraphComponent]. As command parameter the following values are accepted:
 * 
 * - `null`, in which case the [GraphComponent.selection][yfiles.view.GraphComponent.selection] is brought to back or the [GraphComponent.currentItem][yfiles.view.GraphComponent.currentItem] if [GraphEditorInputMode.useCurrentItemForCommands] is set.
 * - a single [IModelItem] that shall be brought to back.
 * - an [IEnumerable][yfiles.collections.IEnumerable] which shall be brought to back.
 * @see [GraphModelManager.toBack][yfiles.view.GraphModelManager.toBack]
 * @see [GraphEditorInputMode.selectionToBack]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23TO_BACK">Online Documentation</a>
 */
 val TO_BACK: ICommand<IModelItem>
/**
 * A [ICommand] that brings the visual representations of [IModelItem]s to the front.
 * 
 * Brings the [main canvas objects][yfiles.view.GraphModelManager.getMainCanvasObject] of [IModelItem]s in their [parent group][yfiles.view.ICanvasObject.group] to the front.
 * [GraphEditorInputMode] can execute this command if it is installed in a [GraphComponent][yfiles.view.GraphComponent]. As command parameter the following values are accepted:
 * 
 * - `null`, in which case the [GraphComponent.selection][yfiles.view.GraphComponent.selection] is brought to the front or the [GraphComponent.currentItem][yfiles.view.GraphComponent.currentItem] if [GraphEditorInputMode.useCurrentItemForCommands] is set.
 * - a single [IModelItem] that shall be brought to the front.
 * - an [IEnumerable][yfiles.collections.IEnumerable] which shall be brought to the front.
 * @see [GraphModelManager.toFront][yfiles.view.GraphModelManager.toFront]
 * @see [GraphEditorInputMode.selectionToFront]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23TO_FRONT">Online Documentation</a>
 */
 val TO_FRONT: ICommand<IModelItem>
/**
 * An [ICommand] to undo the previous operation.
 * 
 * [GraphEditorInputMode] handles this command in conjunction with [UndoEngine][yfiles.graph.UndoEngine].
 * The default shortcut for this command is `Ctrl+Z`.
 * @see [REDO]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23UNDO">Online Documentation</a>
 */
 val UNDO: ICommand<Nothing>
/**
 * An [ICommand] that can be [executed][execute] from within the [GraphComponent][yfiles.view.GraphComponent] to [ungroup the currently selected items][GraphEditorInputMode.ungroupSelection].
 * 
 * The default shortcut for this command is `Ctrl+U`.
 * @see [KeyboardInputMode.addCommandBinding]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23UNGROUP_SELECTION">Online Documentation</a>
 */
 val UNGROUP_SELECTION: ICommand<Nothing>
/**
 * An [ICommand] that invokes [CanvasComponent.updateContentRect][yfiles.view.CanvasComponent.updateContentRect] if executed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23UPDATE_CONTENT_RECT">Online Documentation</a>
 */
 val UPDATE_CONTENT_RECT: ICommand<Rect>
/**
 * An [ICommand] to set the zoom level.
 * 
 * [CanvasComponent][yfiles.view.CanvasComponent] handles this command to change the viewport.
 * If the parameter is a [Point][yfiles.geometry.Point], the viewport will be centered as that point while not changing the zoom level.
 * If the parameter is a [Rect], the viewport will encompass that rectangle and change the zoom level accordingly.
 * If the parameter is an instance of [ILookup][yfiles.graph.ILookup] which returns an instance of [IBoundsProvider][yfiles.view.IBoundsProvider], that [IBoundsProvider][yfiles.view.IBoundsProvider] will be used to obtain a rectangle, which will be used in the same manner as the [Rect] mentioned before. This can be used to zoom to a specific [IModelItem]. Finally, if the parameter is a number, it will be used as the new zoom level to set.
 * There is no default shortcut for this command.
 * @see [INCREASE_ZOOM]
 * @see [DECREASE_ZOOM]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ZOOM">Online Documentation</a>
 */
 val ZOOM: ICommand<Any>
/**
 * An [ICommand] that changes the [CanvasComponent.zoom][yfiles.view.CanvasComponent.zoom] and the [CanvasComponent.viewPoint][yfiles.view.CanvasComponent.viewPoint] in an animated fashion such that the [GraphComponent.currentItem][yfiles.view.GraphComponent.currentItem] becomes fully visible.
 * 
 * This command considers margins defined by [CanvasComponent.contentMargins][yfiles.view.CanvasComponent.contentMargins]. The margins define the visible whitespace around the rectangle in which the respective item is centered. This way it is also possible to get asymmetric whitespace around the item.
 * If a [CanvasComponent.viewportLimiter][yfiles.view.CanvasComponent.viewportLimiter] is enabled, its bounds are respected such that it may also happen that the item is not fully visible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ZOOM_TO_CURRENT_ITEM">Online Documentation</a>
 */
 val ZOOM_TO_CURRENT_ITEM: ICommand<Nothing>
/**
 * Creates a new [ICommand] instance that does nothing.
 * @param [name] The optional name for the command.
 * @return A new [ICommand] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ICommand-defaultmethod-createCommand">Online Documentation</a>
 */
@JsName("createCommand")
  operator fun invoke( name: String?  = definedExternally):ICommand<*>
/**
 * Suggests a re-query of the [executability][canExecute] of all commands that are known to the system to adjust the UI to properly reflect the state.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23ICommand-defaultmethod-invalidateRequerySuggested">Online Documentation</a>
 */
   fun invalidateRequerySuggested()
}
}

/**
 * Occurs when the result of a call to [canExecute] may yield a different result.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ICommand%23CanExecuteChanged">Online Documentation</a>
 */
inline fun <T : Any> ICommand<T>.addCanExecuteChangedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler = { _, _ -> handler() }
    addCanExecuteChangedListener(listener)
    return { removeCanExecuteChangedListener(listener) }
}
