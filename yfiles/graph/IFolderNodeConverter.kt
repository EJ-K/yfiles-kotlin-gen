// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata

/**
 * Interface used by [FoldingManager] and [IFoldingView] which is responsible for managing the appearance of folder nodes.
 * @see [FolderNodeConverter]
 * @see [FoldingManager.folderNodeConverter]
 * @see [IFoldingView.isInFoldingState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFolderNodeConverter">Online Documentation</a>
 */
external interface IFolderNodeConverter  {
  /**
   * Called by [view][IFoldingView] implementations to initially create the appearance of a [folder][IFoldingView] node.
   * @param [state] The folder node state to initialize.
   * @param [foldingView] The graph instance for which the folder node has been created.
   * @param [viewNode] The folder node instance in the view.
   * @param [masterNode] The node that represents the [getMasterItem][IFoldingView] of the view state to change.
   * @see [updateFolderNodeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFolderNodeConverter%23IFolderNodeConverter-method-initializeFolderNodeState">Online Documentation</a>
   */
  fun initializeFolderNodeState(
    state: FolderNodeState,
    foldingView: IFoldingView,
    viewNode: INode,
    masterNode: INode,
  )
  
  /**
   * Called by [view][IFoldingView] implementations to change the appearance of a [folder][IFoldingView] node.
   * @param [state] The folder node state to update.
   * @param [foldingView] The folding view for which the folder node can be changed.
   * @param [viewNode] The folder node instance in the view.
   * @param [masterNode] The node that represents the [getMasterItem][IFoldingView] of the view state to change.
   * @see [initializeFolderNodeState]
   * @see [FoldingManager.updateFolderNodeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFolderNodeConverter%23IFolderNodeConverter-method-updateFolderNodeState">Online Documentation</a>
   */
  fun updateFolderNodeState(
    state: FolderNodeState,
    foldingView: IFoldingView,
    viewNode: INode,
    masterNode: INode,
  )
  
  /**
   * Called by [view][IFoldingView] implementations to adapt the appearance of a group node to changes of its closed state.
   * @param [state] The folder node state to get the properties from.
   * @param [foldingView] The folding view for which the folder node has been changed. The [masterGraph][FoldingManager] can be retrieved from this instance.
   * @param [viewNode] The folder node instance in the view.
   * @param [masterNode] The node that represents the [getMasterItem][IFoldingView] of the view state. This is the item to change.
   * @see [initializeFolderNodeState]
   * @see [FoldingManager.updateFolderNodeState]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFolderNodeConverter%23IFolderNodeConverter-method-updateGroupNodeState">Online Documentation</a>
   */
  fun updateGroupNodeState(
    state: FolderNodeState,
    foldingView: IFoldingView,
    viewNode: INode,
    masterNode: INode,
  )

  
  companion object : InterfaceMetadata<IFolderNodeConverter> {
  }
}
