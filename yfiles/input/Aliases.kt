// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.lang.EventArgs
import yfiles.view.DragDropData

/**
 * Function signature for a callback that determines whether a given [Command] can be executed for the given parameter set in the `args`.
 * @param [event] The arguments which contain the [command][CanExecuteCommandArgs] and the optional [parameter][CanExecuteCommandArgs]. Handler implementations have to set [canExecute][CanExecuteCommandArgs] to `true` to indicate that the command can be executed. Handler implementations have to set [handled][CanExecuteCommandArgs] `true` to indicate that the action was handled.
 */
typealias CanExecuteCommandHandler = (event: CanExecuteCommandArgs) -> Unit

/**
 * Creates a copy of the dragged item in the graph at the specified location.
 * @param [context] The context for which the item should be created.
 * @param [graph] The [Graph][IGraph] in which to create the item.
 * @param [dropData] The data containg the item that was dragged and should therefore be created.
 * @param [dropTarget] The [IModelItem] on which the item is dropped.
 * @param [dropLocation] The location the item should be created.
 * @return The item that has been created, or `null` if no item should be created.
 */
typealias DropCreationCallback<T> = (context: IInputModeContext, graph: IGraph, dropData: DragDropData, dropTarget: IModelItem, dropLocation: Point) -> T?

/**
 * The delegate method that is used by [CreateEdgeInputMode] to create edges between instances of [IPort][yfiles.graph.IPort].
 * @param [context] The context of the input mode this action is used in.
 * @param [graph] The graph to create the edge in.
 * @param [sourcePortCandidate] The source port candidate.
 * @param [targetPortCandidate] The target port candidate. If `null` the callback either has to create the target port itself or cancel the edge creation by returning `null`.
 * @param [templateEdge] The dummy edge instance that serves as template for the actual edge creation. This edge is **not** part of the `graph`
 * @return The newly created edge, `null`, or a `Promise` resolving with an edge or `null`.
 */
typealias EdgeCreationCallback = (context: IInputModeContext, graph: IGraph, sourcePortCandidate: IPortCandidate, targetPortCandidate: IPortCandidate, templateEdge: IEdge) -> Any?

/**
 * A callback that recognizes events.
 * @param [event] The arguments of the event to be decided to handle.
 * @param [source] The source of the event.
 * @return `true` if the `event` is considered to be handled.
 */
typealias EventRecognizer = (event: EventArgs, source: Any) -> Boolean

/**
 * Function signature for a callback that executes a given [Command] for the given parameter set in the `args`.
 * @param [event] The arguments which contain the [command][ExecuteCommandArgs] and the optional [parameter][ExecuteCommandArgs]. Handler implementations have to set [handled][ExecuteCommandArgs] to `true` to indicate that the action was handled and executed successfully by this handler. The list of execution handlers will be traversed for all handlers until the first handler sets [handled][ExecuteCommandArgs] to `true`.
 */
typealias ExecuteCommandHandler = (event: ExecuteCommandArgs) -> Unit

/**
 * A callback that is used by [GraphEditorInputMode] for the creation of nodes.
 * @param [context] The context for which the node should be created.
 * @param [graph] The graph to create the node for.
 * @param [location] The location where the node shall be created.
 * @param [parent] A group node at the click location which can be used as parent node for the newly-created node. `null` if the new node should be created at root level.
 * @return The created node or `null`.
 */
typealias NodeCreationCallback = (context: IInputModeContext, graph: IGraph, location: Point, parent: INode) -> Any?

/**
 * Callback for configuring a [TextEditorInputMode] for editing a provided label instance.
 * @param [context] The context in which the label is being edited or created.
 * @param [mode] The mode that will be used for editing the label's text.
 * @param [label] The label that will be edited or created.
 */
typealias TextEditorInputModeConfigurationHandler = (context: IInputModeContext, mode: TextEditorInputMode, label: ILabel) -> Unit
