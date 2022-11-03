package prr.app.terminal;

import prr.Network;
import prr.app.exceptions.CantStartCommunicationException_app;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.exceptions.*;
import prr.terminals.Terminal;
import prr.app.exceptions.UnknownTerminalKeyException;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Command for sending a text communication.
 */
class DoSendTextCommunication extends TerminalCommand {

        DoSendTextCommunication(Network context, Terminal terminal) {
                super(Label.SEND_TEXT_COMMUNICATION, context, terminal, receiver -> receiver.canStartCommunication());
                addStringField("key", Prompt.terminalKey());
                addStringField("text", Prompt.textMessage());
        }

        @Override
        protected final void execute() throws CommandException {
                //FIXME implement command
                try{
                        _network.SendText(_receiver.get_key(), stringField("key"), stringField("text"));
                } catch (DestinationisOffException e) {
                        _display.popup(Message.destinationIsOff(stringField("key")));
                } catch (TerminalKeyInvalidException e) {
                        throw new InvalidTerminalKeyException(e.getInvalidKey());
                } catch (CantStartCommunicationException e) {
                        throw new CantStartCommunicationException_app(e.getKey());
                } catch (UnknownTerminalException e) {
                        throw new UnknownTerminalKeyException(e.getUnknownKey());
                }
        }
} 
