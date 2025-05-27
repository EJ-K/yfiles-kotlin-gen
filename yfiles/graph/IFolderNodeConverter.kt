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
import yfiles.lang.YObject

/**
 * Interface used by [FoldingManager] and [IFoldingView] which is responsible for managing the appearance of folder nodes.
 * @see [DefaultFolderNodeConverter]
 * @see [FoldingManager.folderNodeConverter]
 * @see [IFoldingView.isInFoldingState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFolderNodeConverter">Online Documentation</a>
 */
external interface IFolderNodeConverter : YObject {
/**
 * Called by [view][IFoldingView] implementations to initially create the appearance of a [folder][IFoldingView.isInFoldingState] node.
 * @param [state] The folder node state to initialize.
 * @param [foldingView] The graph instance for which the folder node has been created.
 * @param [viewNode] The folder node instance in the view
 * @param [masterNode] The node that represents the [IFoldingView.getMasterItem] of the viewstate to change.
 * @see [updateFolderNodeState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFolderNodeConverter%23IFolderNodeConverter-method-initializeFolderNodeState">Online Documentation</a>
 */
   fun initializeFolderNodeState( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )
/**
 * Called by [view][IFoldingView] implementations to change the appearance of a [folder][IFoldingView.isInFoldingState] node.
 * @param [state] The folder node state to update.
 * @param [foldingView] The graph instance for which the folder node can be changed.
 * @param [viewNode] The folder node instance in the view
 * @param [masterNode] The node that represents the [IFoldingView.getMasterItem] of the viewstate to change.
 * @see [initializeFolderNodeState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IFolderNodeConverter%23IFolderNodeConverter-method-updateFolderNodeState">Online Documentation</a>
 */
   fun updateFolderNodeState( state: FolderNodeState ,
 foldingView: IFoldingView ,
 viewNode: INode ,
 masterNode: INode )

companion object : InterfaceMetadata<IFolderNodeConverter> {
}
}
