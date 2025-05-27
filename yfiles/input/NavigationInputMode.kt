// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.collections.ICollection
import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.GraphItemTypes
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.view.GraphComponent
import yfiles.view.IGraphSelection

/**
 * An [IInputMode] that can [navigate][NavigationInputMode] an [IGraph] displayed in a [graphComponent][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NavigationInputMode] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-constructor-NavigationInputMode">Online Documentation</a>
 */
open external class NavigationInputMode () : IInputMode, IEventDispatcher {
  /**
   * Gets or sets a value that determines whether it is allowed to collapse group nodes via the [COLLAPSE_GROUP][Command].
   * 
   * The default value is `true`.
   * @see [collapseGroup]
   * @see [collapseGroupPredicate]
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23allowCollapseGroup">Online Documentation</a>
   */
  final var allowCollapseGroup: Boolean
  
  /**
   * Gets or sets a value that determines whether it is allowed to [enter group nodes][NavigationInputMode] via the [ENTER_GROUP][Command].
   * 
   * The default value is `true`.
   * @see [enterGroupPredicate]
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23allowEnterGroup">Online Documentation</a>
   */
  final var allowEnterGroup: Boolean
  
  /**
   * Gets or sets a value that determines whether it is allowed to [exit the current group node][NavigationInputMode] via the [EXIT_GROUP][Command].
   * 
   * The default value is `true`.
   * @see [exitGroupPredicate]
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23allowExitGroup">Online Documentation</a>
   */
  final var allowExitGroup: Boolean
  
  /**
   * Gets or sets a value that determines whether it is allowed to [expand group nodes][NavigationInputMode] via the [EXPAND_GROUP][Command].
   * 
   * The default value is `true`.
   * @see [expandGroupPredicate]
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23allowExpandGroup">Online Documentation</a>
   */
  final var allowExpandGroup: Boolean
  
  /**
   * Gets or sets the location that should be kept fixed if toggling a group node state.
   * @see [expandGroup]
   * @see [collapseGroup]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23autoGroupNodeAlignmentPolicy">Online Documentation</a>
   */
  final var autoGroupNodeAlignmentPolicy: NodeAlignmentPolicy
  
  /**
   * Gets the list of commands that are available in this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23availableCommands">Online Documentation</a>
   */
  final val availableCommands: ICollection<out Command>
  
  /**
   * Gets or sets a predicate that is queried to determine whether it is allowed to [collapse][NavigationInputMode] the specific group node.
   * 
   * The default value returns the result of the [allowCollapseGroup][NavigationInputMode] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23collapseGroupPredicate">Online Documentation</a>
   */
  final var collapseGroupPredicate: Predicate<INode>
  
  /**
   * Gets the installed [controller][NavigationInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23controller">Online Documentation</a>
   */
  protected final val controller: ConcurrencyController?
  
  /**
   * Gets or sets the enabled state of this input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23enabled">Online Documentation</a>
   */
  open var enabled: Boolean
  
  /**
   * Gets or sets a predicate that is queried to determine whether it is allowed to [enter][NavigationInputMode] the specific group node.
   * 
   * The default value returns the result of the [allowEnterGroup][NavigationInputMode] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23enterGroupPredicate">Online Documentation</a>
   */
  final var enterGroupPredicate: Predicate<INode>
  
  /**
   * Gets or sets a value indicating whether this mode will be the only one running when it has the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23exclusive">Online Documentation</a>
   */
  final var exclusive: Boolean
  
  /**
   * Gets or sets a predicate that is queried to determine whether it is allowed to [exit][NavigationInputMode] the specific group node.
   * 
   * The default value returns the result of the [allowExitGroup][NavigationInputMode] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23exitGroupPredicate">Online Documentation</a>
   */
  final var exitGroupPredicate: Predicate<INode>
  
  /**
   * Gets or sets a predicate that is queried to determine whether it is allowed to [expand][NavigationInputMode] the specific group node.
   * 
   * The default value returns the result of the [allowExpandGroup][NavigationInputMode] property.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23expandGroupPredicate">Online Documentation</a>
   */
  final var expandGroupPredicate: Predicate<INode>
  
  /**
   * Gets or sets a value that determines whether [fitContent][yfiles.view.CanvasComponent] or the [FIT_CONTENT][Command] should be triggered after a group navigation action.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23fitContentAfterGroupActions">Online Documentation</a>
   */
  final var fitContentAfterGroupActions: Boolean
  
  /**
   * Gets or sets the graph this mode operates on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23graph">Online Documentation</a>
   */
  final val graph: IGraph?
  
  /**
   * Gets or sets the [graphComponent][NavigationInputMode] this mode acts on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23graphComponent">Online Documentation</a>
   */
  final var graphComponent: GraphComponent?
  
  /**
   * Gets or sets the [IGraphSelection] this mode operates on.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23graphSelection">Online Documentation</a>
   */
  final val graphSelection: IGraphSelection?
  
  /**
   * Gets or sets the item types that can be navigated to by this mode.
   * @see [navigablePredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23navigableItems">Online Documentation</a>
   */
  final var navigableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether an item should be navigated to.
   * 
   * The default value returns the result of the [navigableItems][NavigationInputMode] property for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23navigablePredicate">Online Documentation</a>
   */
  final var navigablePredicate: Predicate<IModelItem>
  
  /**
   * Retrieves the [IInputModeContext] this mode has been installed in.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23parentInputModeContext">Online Documentation</a>
   */
  protected final val parentInputModeContext: IInputModeContext?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23priority">Online Documentation</a>
   */
  final override var priority: Int
  
  /**
   * Gets or sets a value determining whether a node that has been focused or selected with a keyboard gesture should be made visible by adjusting the viewport.
   * 
   * The default value is `true`.
   * @see [CanvasComponent.ensureVisible][yfiles.view.CanvasComponent.ensureVisible]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23scrollToSelection">Online Documentation</a>
   */
  final var scrollToSelection: Boolean
  
  /**
   * Gets the types of the items that should be selectable by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23selectableItems">Online Documentation</a>
   */
  final var selectableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether an item can be selected.
   * 
   * The default value returns the result of the [selectableItems][NavigationInputMode] property for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23selectablePredicate">Online Documentation</a>
   */
  final var selectablePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets a predicate that is queried to determine whether it is allowed to [toggle][NavigationInputMode] the collapsed state of the given group node.
   * 
   * The default value returns the result of the [expandGroupPredicate][NavigationInputMode] respectively [collapseGroupPredicate][NavigationInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23toggleExpansionStatePredicate">Online Documentation</a>
   */
  final var toggleExpansionStatePredicate: Predicate<INode>
  
  /**
   * Gets or sets a value indicating whether to use the [currentItem][GraphComponent] as a fallback for the commands if no item is provided in the parameter and the current selection is empty.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23useCurrentItemForCommands">Online Documentation</a>
   */
  final var useCurrentItemForCommands: Boolean
  
  /**
   * Gets or sets a value indicating whether navigating the graph with the arrow keys interprets the direction in view coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23useViewCoordinates">Online Documentation</a>
   */
  final var useViewCoordinates: Boolean
  
  /**
   * Adjusts the [contentBounds][yfiles.view.CanvasComponent] to encompass all elements.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-adjustContentBounds">Online Documentation</a>
   */
  protected open fun adjustContentBounds()
  
  /**
   * Adjust the group node location according to the value of [autoGroupNodeAlignmentPolicy][NavigationInputMode].
   * @param [collapse] `true` iff the node has just been collapsed.
   * @param [groupNode] The node that has changed its state.
   * @param [expandedSize] The size of the group node when it is expanded.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-adjustGroupNodeLocation">Online Documentation</a>
   */
  protected open fun adjustGroupNodeLocation(
    collapse: Boolean,
    groupNode: INode,
    expandedSize: Rect?  = definedExternally,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Clears the selection in the [graphComponent][NavigationInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-clearSelection">Online Documentation</a>
   */
  open fun clearSelection()
  
  /**
   * [Collapses][yfiles.graph.IFoldingView] the given group node to hide the contents of the group node from this [IFoldingView][yfiles.graph.IFoldingView].
   * @param [groupNode] The group node to collapse.
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see [allowCollapseGroup]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-collapseGroup">Online Documentation</a>
   */
  open fun collapseGroup(
    groupNode: INode,
  )
  
  /**
   * Performs [collapseGroup][NavigationInputMode] for all [nodes][IGraphSelection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-collapseSelection">Online Documentation</a>
   */
  open fun collapseSelection()
  
  /**
   * Returns the input mode context that will be passed to implementations that are called by this instance and require a context.
   * @return A context to use for the implementations that are called by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-createInputModeContext">Online Documentation</a>
   */
  protected open fun createInputModeContext(): IInputModeContext
  
  /**
   * This method allows for entering a group node so that the currently displayed [IFoldingView][yfiles.graph.IFoldingView]'s [localRoot][yfiles.graph.IFoldingView] will be reset to the provided node.
   * @param [node] The node that needs to be either part of the current graph, or part of the [masterGraph][yfiles.graph.FoldingManager].
   * @see [enterGroupPredicate]
   * @see [allowEnterGroup]
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-enterGroup">Online Documentation</a>
   */
  open fun enterGroup(
    node: INode,
  )
  
  /**
   * Performs [enterGroup][NavigationInputMode] for the first valid [nodes][IGraphSelection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-enterSelectedGroup">Online Documentation</a>
   */
  open fun enterSelectedGroup()
  
  /**
   * Exits the current [localRoot][yfiles.graph.IFoldingView] of the currently displayed [view][yfiles.graph.IFoldingView] and shows the contents of the parent container.
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see [allowExitGroup]
   * @see [exitGroupPredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-exitGroup">Online Documentation</a>
   */
  open fun exitGroup()
  
  /**
   * [Expands][yfiles.graph.IFoldingView] the given group node to show the contents of the collapsed group node in this [IFoldingView][yfiles.graph.IFoldingView].
   * @param [groupNode] The group node to expand
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see [allowExpandGroup]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-expandGroup">Online Documentation</a>
   */
  open fun expandGroup(
    groupNode: INode,
  )
  
  /**
   * Performs [expandGroup][NavigationInputMode] for all [nodes][IGraphSelection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-expandSelection">Online Documentation</a>
   */
  open fun expandSelection()
  
  /**
   * Moves the focus in the given direction, extending the selection to the new element.
   * @param [direction] The direction to move the focus and extend the selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-extendSelectionTo">Online Documentation</a>
   */
  open fun extendSelectionTo(
    direction: MoveFocusDirection,
  )
  
  /**
   * Determines the nearest item in the given `direction`.
   * @param [context] The current input mode context.
   * @param [startItem] The currently selected item reference location for the gesture.
   * @param [direction] The direction for the move action.
   * @param [itemsToCheck] The items that should be considered. Note that this will include `startItem`, but obviously this should not normally be returned, when other candidates are better matches.
   * @return The nearest item in `direction` or `null` if no suitable item can be determined.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-findNearestItem">Online Documentation</a>
   */
  protected open fun findNearestItem(
    context: IInputModeContext,
    startItem: IModelItem?,
    direction: MoveFocusDirection,
    itemsToCheck: IEnumerable<IModelItem>,
  ): IModelItem?
  
  /**
   * Determines the next item when a navigation command is executed.
   * @param [context] The current input mode context.
   * @param [direction] The direction of the command.
   * @return The next item in `direction`, or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-findNextItem">Online Documentation</a>
   */
  protected open fun findNextItem(
    context: IInputModeContext,
    direction: MoveFocusDirection,
  ): IModelItem?
  
  /**
   * Adjusts the viewport to fully encompass the [contentBounds][yfiles.view.CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-fitContent">Online Documentation</a>
   */
  protected open fun fitContent()
  
  /**
   * Determines the reference location for a given [IModelItem]
   * @param [item] The item to get a reference location for.
   * @return The reference location for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-getReferenceLocation">Online Documentation</a>
   */
  protected open fun getReferenceLocation(
    item: IModelItem,
  ): Point
  
  /**
   * Installs this mode into the given context that is provided by the canvas.
   * @param [context] The context that this instance shall be installed into. The same instance will be passed to this instance during [uninstall][IInputMode]. A reference to the context may be kept and queried during the time the mode is installed.
   * @param [controller] The [controller][NavigationInputMode] for this mode.
   * @see [IInputMode.uninstall]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Moves the focus in the given direction, not changing the current selection.
   * @param [direction] The direction to move the focus.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-moveFocusTo">Online Documentation</a>
   */
  open fun moveFocusTo(
    direction: MoveFocusDirection,
  )
  
  /**
   * Moves the focus in the given direction, setting the selection to the new element.
   * @param [direction] The direction to move the focus and selection.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-moveTo">Online Documentation</a>
   */
  open fun moveTo(
    direction: MoveFocusDirection,
  )
  
  /**
   * Called after [cancel][NavigationInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onCanceled">Online Documentation</a>
   */
  protected open fun onCanceled()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerActivated()
  
  /**
   * Called after the [active][ConcurrencyController] property of the installed [ConcurrencyController] has been set to `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  protected open fun onConcurrencyControllerDeactivated()
  
  /**
   * Raises the [group-collapsed][NavigationInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupCollapsed">Online Documentation</a>
   */
  protected open fun onGroupCollapsed(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Raises the [group-collapsing][NavigationInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupCollapsing">Online Documentation</a>
   */
  protected open fun onGroupCollapsing(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Raises the [group-entered][NavigationInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupEntered">Online Documentation</a>
   */
  protected open fun onGroupEntered(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Raises the [group-entering][NavigationInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupEntering">Online Documentation</a>
   */
  protected open fun onGroupEntering(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Raises the [group-exited][NavigationInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupExited">Online Documentation</a>
   */
  protected open fun onGroupExited(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Raises the [group-exiting][NavigationInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupExiting">Online Documentation</a>
   */
  protected open fun onGroupExiting(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Raises the [group-expanded][NavigationInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupExpanded">Online Documentation</a>
   */
  protected open fun onGroupExpanded(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Raises the [group-expanding][NavigationInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onGroupExpanding">Online Documentation</a>
   */
  protected open fun onGroupExpanding(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Actually sets the current item property.
   * @param [graphComponent] The [graphComponent][NavigationInputMode] to set the current item of.
   * @param [item] The item to set.
   * @return Whether the operation was actually performed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onSetCurrentItem">Online Documentation</a>
   */
  protected open fun onSetCurrentItem(
    graphComponent: GraphComponent,
    item: IModelItem?,
  ): Boolean
  
  /**
   * Called after [tryStop][NavigationInputMode] has been called.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-onStopped">Online Documentation</a>
   */
  protected open fun onStopped()
  
  /**
   * Selects the [currentItem][GraphComponent] current item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-selectCurrentItem">Online Documentation</a>
   */
  open fun selectCurrentItem()
  
  /**
   * Selects the given item.
   * @param [graphComponent] The [graphComponent][NavigationInputMode].
   * @param [item] The item to select.
   * @param [extendSelection] if set to `true` the current selection is extended; otherwise, it is cleared beforehand.
   * @see [clearSelection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-selectItem">Online Documentation</a>
   */
  protected open fun selectItem(
    graphComponent: GraphComponent,
    item: IModelItem,
    extendSelection: Boolean,
  )
  
  /**
   * Sets the "current" item to the given one.
   * @param [item] The item to set as the current item.
   * @see [onSetCurrentItem]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-setCurrentItem">Online Documentation</a>
   */
  open fun setCurrentItem(
    item: IModelItem?,
  )
  
  /**
   * Sets the [graphComponent][NavigationInputMode] to use for the various actions.
   * @param [graphComponent] The control to use or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-setGraphComponent">Online Documentation</a>
   */
  protected open fun setGraphComponent(
    graphComponent: GraphComponent?,
  )
  
  /**
   * Determines whether the input mode should try to request the mutex when a command is executed.
   * @return whether the input mode should request the mutex.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-shouldRequestMutex">Online Documentation</a>
   */
  protected open fun shouldRequestMutex(): Boolean
  
  /**
   * Toggles the [expanded/collapsed][yfiles.graph.IFoldingView] state for the given group node in the [IFoldingView][yfiles.graph.IFoldingView].
   * @param [groupNode] The group node to toggle the state for.
   * @see [FoldingManager][yfiles.graph.FoldingManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-toggleExpansionState">Online Documentation</a>
   */
  open fun toggleExpansionState(
    groupNode: INode,
  )
  
  /**
   * Overridden to only return `true` if this instance does not currently [have the input mutex][ConcurrencyController].
   * @return `true` iff this instance does not [own the mutex][ConcurrencyController].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-tryStop">Online Documentation</a>
   */
  override fun tryStop(): Boolean
  
  /**
   * Uninstalls this mode from the given context.
   * @param [context] The context to deregister from. This is the same instance that had been passed to [install][IInputMode] during installation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23NavigationInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<NavigationInputMode> {
  }
}

inline fun NavigationInputMode(
    block: NavigationInputMode.() -> Unit
): NavigationInputMode {
    return NavigationInputMode()
        .apply(block)
}

/**
 * `group-collapsing`: Occurs before a group will be [Collapsed][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23group-collapsing">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupCollapsingHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("group-collapsing", listener)
  return { removeEventListener("group-collapsing", listener) }
}

/**
 * `group-collapsed`: Occurs whenever a group has been [Collapsed][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23group-collapsed">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupCollapsedHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("group-collapsed", listener)
  return { removeEventListener("group-collapsed", listener) }
}

/**
 * `group-expanding`: Occurs before a group will be [Expanded][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23group-expanding">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupExpandingHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("group-expanding", listener)
  return { removeEventListener("group-expanding", listener) }
}

/**
 * `group-expanded`: Occurs whenever a group has been [Expanded][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23group-expanded">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupExpandedHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("group-expanded", listener)
  return { removeEventListener("group-expanded", listener) }
}

/**
 * `group-entering`: Occurs before a group will be [Entered][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23group-entering">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupEnteringHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("group-entering", listener)
  return { removeEventListener("group-entering", listener) }
}

/**
 * `group-entered`: Occurs whenever a group has been [Entered][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23group-entered">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupEnteredHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("group-entered", listener)
  return { removeEventListener("group-entered", listener) }
}

/**
 * `group-exiting`: Occurs before a group will be [Exited][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23group-exiting">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupExitingHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("group-exiting", listener)
  return { removeEventListener("group-exiting", listener) }
}

/**
 * `group-exited`: Occurs whenever a group has been [Exited][NavigationInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NavigationInputMode%23group-exited">Online Documentation</a>
 */
inline fun  NavigationInputMode.addGroupExitedHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("group-exited", listener)
  return { removeEventListener("group-exited", listener) }
}
