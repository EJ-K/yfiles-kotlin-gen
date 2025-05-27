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
import yfiles.lang.IEventDispatcher
import yfiles.view.DragDropData

/**
 * Function signature for a callback that determines whether a given [ICommand] can be executed for the given parameter set.
 * @param [command] The command to test executability.
 * @param [parameter] The optional parameter for the command execution.
 * @param [source] The source for which the command shall be executed.
 * @return `true`, iff the command can been executed for the given parameter set.
 */
typealias CanExecuteCommandHandler<T> = (command: ICommand<T>,
parameter: T?,
source: IEventDispatcher) -> Boolean

/**
 * Creates a copy of the dragged item in graph at the specified location.
 * @param [T] The type of the item being dropped.
 * @param [context] The context for which the item should be created.
 * @param [graph] The [Graph][IGraph] in which to create the item.
 * @param [dropData] The data containg the item that was dragged and should therefore be created.
 * @param [dropTarget] The [IModelItem] on which the item is dropped.
 * @param [dropLocation] The location the item should be created.
 * @return The item that has been created, or `null` if no item should be created.
 */
typealias DropCreationCallback<T> = (context: IInputModeContext,
graph: IGraph,
dropData: DragDropData,
dropTarget: IModelItem,
dropLocation: Point) -> T?

/**
 * The delegate method that is used by [CreateEdgeInputMode] to create edges between instances of [IPort][yfiles.graph.IPort].
 * @param [context] The context of the input mode this action is used in.
 * @param [graph] The graph to create the edge in.
 * @param [sourcePortCandidate] The source port candidate.
 * @param [targetPortCandidate] The target port candidate. If `null` the callback either has to create the target port itself or cancel the edge creation by returning `null`.
 * @param [templateEdge] The dummy edge instance that serves as template for the actual edge creation. This edge is **not** part of the `graph`
 * @return The newly created edge, `null`, or a `Promise` resolving with an edge or `null`.
 */
typealias EdgeCreationCallback = (context: IInputModeContext,
graph: IGraph,
sourcePortCandidate: IPortCandidate,
targetPortCandidate: IPortCandidate,
templateEdge: IEdge) -> Any?

/**
 * A callback that recognizes events.
 * @param [source] The source of the event.
 * @param [event] The arguments of the event to be decided to handle.
 * @return `true` if the `event` is considered to be handled.
 */
typealias EventRecognizer = (source: IEventDispatcher,
event: EventArgs) -> Boolean

/**
 * Function signature for a callback that executes a given [ICommand] for the given parameter set
 * @param [command] The command to execute.
 * @param [parameter] The optional parameter for the command execution.
 * @param [source] The source for which the command shall be executed.
 * @return Return `true` to indicate that the action was handled and executed successfully by this handler. Note that currently this return value is ignored. In a future version, it can be used to support multiple execution handlers. The list of execution handlers would then be traversed until the first handler yields `true`. Returning `false` would then mean to run the default or fallback action, instead, if any. So although currently it doesn't matter what gets returned, returning `true` will probably be the correct value in future versions of yFiles.
 */
typealias ExecuteCommandHandler<T> = (command: ICommand<T>,
parameter: T?,
source: IEventDispatcher) -> Boolean

/**
 * A callback that is used by [GraphEditorInputMode] for the creation of nodes.
 * @param [context] The context for which the node should be created.
 * @param [graph] The graph to create the node for.
 * @param [location] The location where the node shall be created.
 * @param [parent] A group node at the click location which can be used as parent node for the newly-created node. `null` if the new node should be created at root level.
 * @return The created node, `null`, or a Promise resolving with a node or `null`.
 */
typealias NodeCreationCallback = (context: IInputModeContext,
graph: IGraph,
location: Point,
parent: INode) -> Any?

/**
 * Callback for configuring a [TextEditorInputMode] for editing a provided label instance.
 * @param [context] The context in which the label is being edited or created.
 * @param [mode] The mode that will be used for editing the label's text.
 * @param [label] The label that will be edited or created.
 */
typealias TextEditorInputModeConfigurationHandler = (context: IInputModeContext,
mode: TextEditorInputMode,
label: ILabel) -> Unit
