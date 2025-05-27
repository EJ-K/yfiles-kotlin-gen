// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import js.promise.Promise
import web.html.HTMLElement
import web.html.HTMLInputElement
import yfiles.graph.IGraph
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.view.GraphComponent

/**
 * Provides support for opening and saving graphs from and to GraphML.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this class.
 * @param [graphComponent] The [GraphComponent] that the [ICommand.OPEN][yfiles.input.ICommand.OPEN] and [ICommand.SAVE][yfiles.input.ICommand.SAVE] commands are registered on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23GraphMLSupport-constructor-GraphMLSupport">Online Documentation</a>
 */
external open class GraphMLSupport  ( graphComponent: GraphComponent?  = definedExternally) : YObject {

/**
 * Gets or sets the [graphMLIOHandler] to use for the various I/O methods in this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23graphMLIOHandler">Online Documentation</a>
 */
final var graphMLIOHandler: GraphMLIOHandler
/**
 * Gets or sets a value indicating the type of storage used by the [ICommand.OPEN][yfiles.input.ICommand.OPEN] and [ICommand.SAVE][yfiles.input.ICommand.SAVE] commands.
 * 
 * By default this feature is set to [StorageLocation.NONE].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23storageLocation">Online Documentation</a>
 */
final var storageLocation: StorageLocation
/**
 * Creates the [HTMLInputElement] that is used by the [openFile] methods.
 * @return The pre-configured element to use.
 * @see [openFile]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23GraphMLSupport-method-createOpenFileInputElement">Online Documentation</a>
 */
 open protected   fun createOpenFileInputElement():HTMLInputElement
/**
 * Creates the [HTMLElement] that is used by the [saveFile] method.
 * @return The pre-configured element to use or `null` if element creation failed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23GraphMLSupport-method-createSaveFileTextElement">Online Documentation</a>
 */
 open protected   fun createSaveFileTextElement():HTMLElement?
/**
 * Shows a [open file dialog][createOpenFileInputElement] and imports the selected GraphML file into the graph of the provided `graphComponent`.
 * @param [graphComponent] The GraphML file is imported into the graph of this [GraphComponent].
 * @param [storageLocation] The [storageLocation] to open from. If not provided, the value of the [storageLocation] property is used.
 * @return A promise that will resolve to the loaded graph instance or reject upon exceptions during loading. Note that if the file open dialog is canceled by the user, the promise will stay unresolved because there is no API available that can be used to determine whether the user has pressed cancel. Depending on the UA implementation it may be possible to listen to focus or other input device events on the page to detect when the user has closed the file open dialog.
 * @see [storageLocation]
 * @see [saveFile]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23GraphMLSupport-method-openFile(GraphComponent,StorageLocation)">Online Documentation</a>
 */
 open   fun openFile( graphComponent: GraphComponent ,
 storageLocation: StorageLocation?  = definedExternally):Promise<IGraph>
/**
 * Shows a [open file dialog][createOpenFileInputElement] and imports the selected GraphML file into the provided `graph`.
 * @param [graph] The GraphML file is imported into this graph.
 * @param [storageLocation] The [storageLocation] to open from. If not provided, the value of the [storageLocation] property is used.
 * @return A promise that will resolve to the loaded graph instance or reject upon exceptions during loading. Note that if the file open dialog is canceled by the user, the promise will stay unresolved because there is no API available that can be used to determine whether the user has pressed cancel. Depending on the UA implementation it may be possible to listen to focus or other input device events on the page to detect when the user has closed the file open dialog.
 * @see [storageLocation]
 * @see [saveFile]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23GraphMLSupport-method-openFile(IGraph,StorageLocation)">Online Documentation</a>
 */
 open   fun openFile( graph: IGraph ,
 storageLocation: StorageLocation?  = definedExternally):Promise<IGraph>
/**
 * Registers the [ICommand.OPEN][yfiles.input.ICommand.OPEN] and [ICommand.SAVE][yfiles.input.ICommand.SAVE] commands on the given `graphComponent` with the current [storageLocation].
 * @param [graphComponent] The [GraphComponent] to register the commands on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23GraphMLSupport-method-registerCommands">Online Documentation</a>
 */
 final   fun registerCommands( graphComponent: GraphComponent )
/**
 * Exports the graph as GraphML and saves it to the provided storage location.
 * @param [graph] The graph to save as GraphML.
 * @param [storageLocation] The [storageLocation] to open from. If not provided, the value of the [storageLocation] property is used.
 * @return A promise that will either resolve to the GraphML string representation of the graph or reject upon exceptions during the save operation.
 * @see [storageLocation]
 * @see [openFile]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphMLSupport%23GraphMLSupport-method-saveFile">Online Documentation</a>
 */
 open   fun saveFile( graph: IGraph ,
 storageLocation: StorageLocation?  = definedExternally):Promise<String>

companion object : ClassMetadata<GraphMLSupport> {
}
}

inline fun GraphMLSupport(
    block: GraphMLSupport.() -> Unit
): GraphMLSupport {
    return GraphMLSupport()
        .apply(block)
}
